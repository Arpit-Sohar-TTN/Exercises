/**
 * Created by arpit on 18/4/17.
 */
class Exercise5 {
    String testIf(def test) {
        if (test)
            println "test evaluated to true inside if"
        else
            println "test false"
    }

     static void main(String[] args) {
         //Checking various objects

     //   def test = "Test"  //test evaluated to true inside if
     //   def test = "null"  //test evaluated to true inside if
      //  def test = null  //test false
      //  def test = 100  //test evaluated to true inside if
     //   def test = 0  //test false
        def test = []  //test false
         new Exercise5().testIf(test)
      /*
      List list = new ArrayList();
         list.add(null)
         new Exercise5().testIf(list)
         */

         HourMinutes hourMinutes = new HourMinutes(hours: 2,minutes: 40)
         println hourMinutes
         HourMinutes hourMinutes2 = new HourMinutes(hours: 1,minutes: 10)
       //  HourMinutes result = new HourMinutes()
        def result = hourMinutes+hourMinutes2
         println result
    }
}

class HourMinutes {
    int hours;
    int minutes;
    HourMinutes plus (HourMinutes hM) {

        new HourMinutes(hours:hours+hM.hours,minutes: minutes+hM.minutes)
    }

    @Override
     String toString() {
        return "HourMinutes{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
