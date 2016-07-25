/*
 *  Native Module to retrieve device performance in Android.
 *
 *  Example:
 *  const DeviceYearClass = require('react-native-device-year-class');
 *  const yearClass = DeviceYearClass.getYearClass();
 *
 *  if (yearClass > 2011) {
 *      animations = true;
 *  }
 */

import { NativeModules } from 'react-native';

export default NativeModules.DeviceYearClass;
module.exports = NativeModules.DeviceYearClass;
