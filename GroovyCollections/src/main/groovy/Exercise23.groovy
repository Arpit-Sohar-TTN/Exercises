/**
 * Created by arpit on 20/4/17.
 */
class Exercise23 {
    static void main(String[] args) {
        String url = "http://www.google.com?name=johny&age=20&hobby=cricket"
        String query = url.split("\\?")[1];
        def list = query.split("&")
        Map map = new HashMap()
        list.each {
            pair ->
                def index = pair.indexOf("=")
                map.put(pair.substring(0, index), pair.substring(index + 1, pair.size()))
        }

        assert map == [name: 'johny', age: '20', hobby: 'cricket'] as Map
        println(map)

    }
}
