package com.upinion.DeviceYearClass;

import com.facebook.device.yearclass.YearClass;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;


public class DeviceYearClass extends ReactContextBaseJavaModule {

    public DeviceYearClass(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    /**
     * Returns the name of this module in React-native (javascript).
     */
    @Override
    public String getName() {
        return "DeviceYearClass";
    }

    /**
     * Function to be shared to React-native, it returns the
     * year this Android device was considered high-end.
     *
     * @return { Promise } yearClass
     */
    @ReactMethod
    public void getYearClass(Promise promise) {
        try {
            int yearClass;
            yearClass = YearClass.get(getCurrentActivity());
            promise.resolve(yearClass);
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}