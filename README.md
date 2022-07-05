# QA-Preparation
My Preparation as a Automated Test intern at BITĖ Company 

<h3>Unit Testing</h3>
What is unit testing?
Unit testing is testing individual units or components of an application. The aim is to ensure that each unit performs as designed. It is typically carried out by developers, rather than the quality assurance team, as it requires a detailed knowledge of the internal program design and source code.]

Pros  | Cons |
------------- | ------------- |
Finds bugs early  | /Hard to write |
Facilitates change  | /Difficult to automate |
Simplifies integration  | /	Comprehensive version control needed |

<h4> * Pros * </h4>
When a failure occurs in a unit test, it’s either caused by a bug in the code or a problem with the actual unit test itself. Either way, it’s easy to pinpoint the problem and early enough in the development cycle to fix it. Unit testing ensures that the code functions properly as the code base grows. This streamlines the code to make it more readable and less complex. By verifying each unit, integration into an application is simpler.

Unit testing also provides guaranteed documentation for an application. This is helpful for other developers that need to find out what functionality is provided by a particular unit.
<h4> * Cons * </h4>
Good unit tests are complex to write. It can mean the test code is likely to be at least as buggy as the code it is testing. This scenario is the same for both manual and automated unit testing. It’s nearly impossible to evaluate every single execution path in all but the most basic applications. A comprehensive version control system is essential to record the changes in case anyone needs to refer back to previous versions.

<h3>API Testing</h3>

What is API testing?
Application programming interfaces (API) testing means checking APIs directly. An API is a feature that allows one application to interact and communicate to other applications. It determines if the APIs meet expectations for functionality,, reliability, performance, and security. This does not cover usability or UI or UX testing. API testing involves sending calls to an API, receiving an output and recording a response.

Pros  | Cons |
------------- | ------------- |
Verification of API functionality | /	Set up can be complex|
Checks API integration with other applications  | /Coding knowledge required |
Tests authentication credentials  |  |


<h4> * Pros * </h4>
If an API is not tested properly, it may cause problems to not only the primary application but the other applications it integrates with. API testing provides a vital check to ensure this functionality works correctly.

<h4> * Cons * </h4>

Setting up a testing environment for API testing can be complex. Also, a good level of coding knowledge is necessary for API test cases.
