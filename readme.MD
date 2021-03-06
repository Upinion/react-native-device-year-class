# react-native-device-year-class
React Native DeviceYearClass allows you to estimate the performance of an Android device.

### Installation

```bash
1) Add repository to package.json
"react-native-device-year-class": "git+ssh://git@github.com:Upinion/react-native-device-year-class.git"

2) Run
npm install

or manually:
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
            new DeviceYearClassPackage() // <-- Add this line with your package name.
    ); 
}

```

## Example

DeviceYearClass.getYearClass() returns a promise!

Example:

```javascript
const DeviceYearClass = require('react-native-device-year-class');

let animations = false;

DeviceYearClass.getYearClass()
    .then((yearClass) => {
        if (yearClass > 2011) {
            animations = true;
        }
    });

```

## Java dependency
https://github.com/facebook/device-year-class