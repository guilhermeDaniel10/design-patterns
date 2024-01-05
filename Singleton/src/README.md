**Purpose of Singleton Class**

The primary purpose of a java Singleton class is to restrict the limit of the number of object creations to only one. This often ensures that there is access control to resources, for example, socket or database connection.

We can use this single object repeatedly as per the requirements. This is the reason why multi-threaded and database applications mostly make use of the Singleton pattern in Java for caching, logging, thread pooling, configuration settings, and much more.

**Singleton Key Points:**

How to Design/Create a Singleton Class in Java?
To create a singleton class, we must follow the steps, given below:

1. Ensure that only one instance of the class exists.

2. Provide global access to that instance by
   * Declaring all constructors of the class to be private.
   * Providing a static method that returns a reference to the instance. The lazy initialization concept is used to write the static methods.
   * The instance is stored as a private static variable.

**To instantiate a singleton class, we use the getInstance() method.** 