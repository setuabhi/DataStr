1. Service shouldn't know which class client is referring(which strategy client using)
2. Basically in service class only interface should be used not any concrete class
3. Here client knows the exact class being instantiated but strategy class doesn't 
4. We decide strategy from setter not constructor , so that client can change it 
5. while in factory client doesn't know the exact class being instantiated, factory class does