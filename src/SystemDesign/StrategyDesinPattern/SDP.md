1. It came into the picture to address
   problems related to flexibility, and reusability of code when dealing with different behaviors.
2. It follows open close and Dependency Inversion
3. we define PaymentStrategy interface
4. define strategies classes that's flexible (Gpay , creditCard)
5. define processPaymentContext class with **Has A** relationship with PaymentStrategy interface
6. Client code
