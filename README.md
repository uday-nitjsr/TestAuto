# TestAutothon-device-farm-test
Repository for device farm test

Device farm is a AWS service which can be used for Native/Hybrid/Web(Html5) apps
You can device farm documentation and support here : http://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html

We used Appium TestNG test type for android application. It has a basic Page Object model. As mentioned in the documentation we are not providing any capabilities
to the driver instance. This is taken care of once we select a device pool. TO test your code locally you need to launch appium server in a prelaunch mode.You can
use below command for this:

    appium --pre-launch --app-pkg <appPackage> --app-activity <activityName> --platform-name Android --device-name <deviceName>

Once you're done with test cases. You need to package your test cases, and upload it on your device farm project's test run. You can check this link for maven dependencies and plugin configuration: http://docs.aws.amazon.com/devicefarm/latest/developerguide/test-types-android-appium-java-testng.html 

# CI configuration

Device farm provides a Jenkins plugin
Once you install this plugin. You need to provide IAM user permission to access Device farm. Follow steps provided in : http://docs.aws.amazon.com/devicefarm/latest/developerguide/jenkins-ci-set-up-iam-user.html
After this, go to Jenkins UI->Manage Jenkins->Configure System->AWS Device farm, and provide Access key ID and Secure Key ID.

Now you're good to go for a Jenkins job. You can see a post build action as Device farm option. There you have to provide similar inputs required to run a test on device farm via AWS console.
