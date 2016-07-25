# react-native-device-year-class
React Native DeviceYearClass allows you to estimate the peformance of an Android device.

### Installation

```bash
npm install --save react-native-device-year-class

or manually

git clone the directory to [node_modules/react-native-device-year-class]
```

### Add it to your android project

* In `android/setting.gradle`

```gradle
...
include ':DeviceYearClass', ':app'
project(':DeviceYearClass').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-device-year-class')
```

* In `android/app/build.gradle`

```gradle
...
dependencies {
    ...
    compile project(':DeviceYearClass')
}
```

* register module (in MainActivity.java)

```java
import com.upinion.DeviceYearClass.DeviceYearClassPackage;  // <--- import

...

protected List<ReactPackage> getPackages() {
    return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
            new DeviceYearClassPackage()); // <-- Add this line with your package name.
}

```

## Example

DeviceYearClass.getYearClass()

Example:

```javascript
const DeviceYearClass = require('react-native-device-year-class');

const yearClass = DeviceYearClass.getYearClass();

if (yearClass > 2011) {
    animations = true;
}

```

## Java dependency
https://github.com/facebook/device-year-class