# DS-Project
This Data Structure project is about a clinic ticket/token generator system using Data Structures with GUI in java.

Description:

This is a Ticket/Token generating system that can be used for a variety of businesses and occupations where there is a great number
of people who made entries on daily basis. This system is based to be run in a clinic where more than one doctors are working in a 
collective manner and an operator (User of the software) is supposed to make entries and manage records.
The principle of queue is applied throughout the system. Also the priority queue is in action inside the system in certain conditions.
Certain data structures are used such as Arrays and LinkedLists to spread the whole queue and priority queue principle.

Working:

This program (software) can be used by executing the .exe file. 

After installing and opening the software the first page is to sign in the system. The operator is supposed to provide the Sign-In ID
and Password provided at the bottom. 

After the succesful log in procedure the operator will be all set up with the patient status frame. This tab is supposed to be used by
the operator to enter any Patient who will come in the clinic. The frame has contain common required options, such as name, age, weight,
and Doctor selection options, as well as important option such as status which indicate if the condition of patient required urgent
treatment or if it fall it normal category.

This data is used to provide the Token (receipt) with the approximate timing to the patient.

Inside the software, operator has been also provided with the "Records" tab, which shows the exact number of patients assign to the
different doctors and their information to the operator.

More to Read:

Different data structures are used to handle records and also to provide the principle of queue. Mainly arrays and LinkedList is used.
Also the timing is considered as an important element to portray the queue principle. The timing is approached by checking the difference
between patients. The structure shown below will provide the idea of Time Management acquired inside the software.

   Patients arriving	      |	 	Testing Time Difference			       | Printed_Time |    (String arrived  = 9:00, String future = 9:10)
 											              
W arrive (first) at, 9:00 am  | Checking/Test ||arrived (9:00) - 9:00|| = 00 ; & 00<20 |     9:10     |   arrived = (9:00)   |  future = 9:20  
X arrive         at, 9:02 am  | Checking/Test ||arrived (9:00) - 9:02|| = 02 ; & 02<20 | future(9:20) |   arrived = (9:02)   |  future = 9:30  
Y arrive         at, 9:23 am  | Checking/Test ||arrived (9:02) - 9:23|| = 21 ; & 21!<20|     9:23     |   arrived = (9:23)   |  future = 9:33  
Z arrive         at, 9:24 am  | Checking/Test ||arrived (9:23) - 9:24|| = 01 ; & 01<20 | future(9:33) |   arrived = (9:24)   |  future = 9:43  


Sign-In ID:SIBA
Sign-In Passcode:7700
