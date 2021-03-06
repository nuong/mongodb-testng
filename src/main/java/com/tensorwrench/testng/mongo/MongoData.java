/*
Copyright 2013 TensorWrench, LLC 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License.
*/
package com.tensorwrench.testng.mongo;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;



/**
 * This annotation marks tests or classes for the data file to use in populating the
 * database for the test run.  The value should be of the format specified in
 * {@link MongoTestDriver}. 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD,TYPE})
@Inherited
public @interface MongoData {
	
	/** Name of the JSON file that's on the classpath holding the data for this test */
	public String value() default "";
}
