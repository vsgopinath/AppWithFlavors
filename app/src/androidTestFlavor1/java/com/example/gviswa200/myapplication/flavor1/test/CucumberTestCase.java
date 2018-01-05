package com.example.gviswa200.myapplication.flavor1.test;

import cucumber.api.CucumberOptions;

/**
 * This class configures the Cucumber test framework and Java glue code
 *
 * Flavors' support: When you have multiple flavors the best configuration is to follow this steps:
 * 1- Create a copy of this file on each flavor's specific test package and delete the original file
 *      i.e. androidTestFlavor/java/com/neoranga55/cleanguitestarchitecture/test/CucumberTestCase.java
 * 2- Modify the original report path to include the flavor /mnt/sdcard/cucumber-reports/FLAVOR/cucumber-html-report
 * 3- Tag your scenarios in the feature files with new specific tags for each flavor and include them in the flavor's version of this file
 *      i.e. Add tag @flavor-one to a test scenario and modify the flavor's CucumberTestCase.java with tags={"~@manual", "@flavor-one"}
 */
@CucumberOptions(features = "features", // Test scenarios
        glue = {"com.example.gviswa200.myapplication.cucumber.steps"}, // Steps definitions
        format = {"pretty", // Cucumber report formats and location to store them in phone/emulator
                "html:/data/data/com.example.gviswa200.myapplication.flavor1/cucumber-reports/cucumber-html-report",
                "json:/data/data/com.example.gviswa200.myapplication.flavor1/cucumber-reports/cucumber.json",
                "junit:/data/data/com.example.gviswa200.myapplication.flavor1/cucumber-reports/cucumber.xml"
            // Note: if you don't have write access to /mnt/sdcard/ on the phone use instead
            // the following path here and in the build.gradle: /data/data/com.neoranga55.cleanguitestarchitecture/cucumber-reports/
        },
        tags={"@welcome"}
)
// This class must be in a different package than the glue code
// (this class is in '...cucumber.test' and glue is in '...cucumber.steps')
class CucumberTestCase {
}
