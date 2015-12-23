# File_ClientServer_Project

copy and paste this link.
experiment with and apply the security concepts that are covered in the classroom by developing a group based file sharing application that is secure against a number of different types of security threats. At a high level, the system will consist of three main components: a single group server, a file server, and some number of clients.
The group server manages the users in the system and keeps track of the groups to which each user belongs. The group server will provide each legitimate user with an authentication token. Users within the system make use of a networked client application to log in to the system and manage their groups (via the group server), as well as view files stored in the system (via the file servers).


2. Phase I
In this phase of the project, you will implement a bare-bones system that provides the necessary core functionality without any security features whatsoever. The implementation of security features will be deferred to the later phase of the project. The reason for this is twofold. From a pragmatic perspective, you have yet to learn the security “tricks and tools" that you will need to properly secure this type of application. Furthermore, having a fully-functional system in hand will simplify the later phase of the project, as you will only be debugging security features, not security features and core functionality.
Here is a brief description for each component of this system:


Client functionalities
You need to develop a client application that allows a human user to access this functionality. It is totally up to you to design the way the client application interacts with the user. One group can just implement a simple numeric command list to execute the different functions. Another group can implement a simple GUI. In all cases, keep it as simple as possible, there is no need to spend too much time on this part of the project, the core functionalities are more important.


3. Phase II
In this phase of the project, you will harden your system against variety of common security threats. A list of specific classes of threats for which your system must provide protections is described in detail.
Threats to Protect Against
Now you are to consider certain classes of threats that were not addressed in the last phase of the project. In particular, your group must develop defenses against the following classes of threats in this phase of the project:
T1: Unauthorized Token Issuance. Due to the fact that clients could be untrusted, we must protect against the threat of illegitimate clients requesting tokens from the group server. Your implementation must ensure that all clients are authenticated in a secure manner prior to issuing them tokens. That is, we want to ensure that Alice cannot request and receive Bob's security token from the group server.
T2: Token Modification/Forgery. Users are expected to attempt to modify their tokens to increase their access rights, and to attempt to create forged tokens. Your implementation of the UserToken class must be extended to allow the file server (or anyone else) to determine whether a token is in fact valid. Specifically, it must be possible for a third-party to verify that a token was in fact issued by a trusted group server and was not modified after issuance.
T3: Information Leakage via Passive Monitoring. We are assuming the existence of passive attackers (e.g., nosy administrators), therefore you must ensure that all communications between your client and server applications are hidden from outside observers. This will ensure that file contents remain private, and that tokens are secured during transit.
4. Implementation issues
Provided with this document is a zip file named “server_sample.zip”. This is a sample code for a chat program that allows machines to connect and send string messages between them. The code is well commented for first time sockets programmers. The code provided is in Java. If your group wishes to implement this project in C or C++, you will have to notify me so that I can provide you with similar code for that language. Yet, handling sockets programming is simpler and clearer in Java, therefore it is the recommended language to be used for this project.
Any cryptographic functions that you will need to use are available in most languages. For example in Java, it is called Java Cryptography Architecture (JCA) which are packages that you import and gives you all different cryptographic functions. Documentations for these packages are available online through Oracle Java documentation. Similar libraries are available for C and C++. Therefore, whatever language you will be using, you do not need to implement any of the crypto yourself, you will simply use them.
To simplify the implementation, you do not need to worry about keys generations or exchange (if needed). You can hard code all the keys into your system and assume your clients have their keys ready once created in the system
