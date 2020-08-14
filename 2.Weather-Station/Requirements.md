# Requirements
1. Three different plays for user.
   a. Current status 
   b. Weather Statistics 
   c. Simple forfast 
2. API for future use to develop new displays 

# 思路
1. 没有任何思路，因为还没搞懂什么意思。

2. 从给的图中我们可以知道，气象站会给我们数据，比如湿度，温度，气压。
但是从哪里来，我们可以忽略从哪里来。但是会给。
在WeatherData里面，我们可以assume里面有getter()的方法，去get这些数据：
getTemperature()
getHumidity()
getPressure()
measurementsChanged(){}
// 当气象测量更新，measurementsChanged（）会被调用。

3. 我们当前需要做的是怎么去做measurementsChanged()

4. 但是我们需要考虑，因为一旦有新的数据，我们需要更新所有的用户。
   所以，我们不想更新每个用户，这样就太笨了。

5. 所以新的办法！我们可以用到一个interface，然后这个用此interface注册的用户可以用特性我们给interface的。然后用户自己有update（）来更新他们的数据。
Interface Subject[registerUser(), removeUser(), NotifyUser()]
Interface User[update()]
Interface Display[Display()]
   a. we need a weatherData to access the interface(Subject), so it will have the feature. 
   b. we need a specific user(display) to access features from Interface_User and Interface_Display
 
