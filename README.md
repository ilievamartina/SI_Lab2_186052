## **Втора Лаб. вежба по предметот Софтверско инженерство**
### **Мартина Илиева, 186052**
**Група на код**</br>
Ја добив групата на код 2. </br>

**Control Flow Graph**</br>
![Alt text](images/ControlFlowGraph.png)</br>

**Цикломатска комплексност**</br>
Цикломатската комплексност на овој код е 8, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=7, па цикломатската комплексност изнесува 8. </br>

**Тест случаи според критериумот Every statement** </br>
Test 1: user = new User(“martina”, “12345”, “martina@gmail.com”), allUsers=[“martina1”,”dajana1”] - **додавање на нов корисник**</br>
Test 2: user = null, allUsers=[“martina1”,”dajana1”,”elena”] - **нема иницијализиран корисник (референцата покажува кон null)**</br>
Test 3: user = new User(“martina1”,”12345”,”martina1@gmail.com”), allUsers=[“martina1”,”dajana1”] - **додавање на веќе постоечки корисник**</br>
Test 4: user= new User(“martina12”,”12345”,”martina@gmail”), allUsers=[“martina1”,”dajana1”] - **mail-от не е валиден, во овој случај нема “.”, но истото ќе важи и ако mail-от се напише без “@”, или без двете**</br>
Test 5: user = new User(“martina12”,”12345”, null), allUsers=[“martina1”,”dajana1”,”elena”] - **нема внесено mail**</br>
![Alt text](images/EveryStatement.png)</br>


**Тест случаи според критериумот Every path**</br>
Path 1: кога инстанцата од класата User покажува кон null.</br>
Path 2: кога се иницијализира веќе постоечки корисник(username-от постои).</br>
Path 3: кога email-от е иницијализиран на null.</br>
Path 4: кога се иницијализира нов, непостоечки корисник.</br>
Path 5: кога mail-от не е внесен соодветно(нема “.” или ”@” или и двете).</br>
![Alt text](images/EveryPath.png)</br>

**Објаснување на напишаните unit tests**</br>
Ги пишував истите тестови од сликите погоре, така што секој тест враќа соодветно true, false или фрла exception.
