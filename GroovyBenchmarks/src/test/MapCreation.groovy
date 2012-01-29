package test

class MapCreation {
	
	static int times = 100000

	public static void main(String[] args) {
		
		
		time("Java way instance: ",{
			Map m = new HashMap(3)
			m.put("a", "a")
			m.put("b", "b")
			m.put("c", "c")
		})
		
		time("Groovy way initialize: ",{
			def m = [
				"a":"a",
				"b":"b",
				"c":"c"
			]
		})
		
		time("Groovy way instance: ",{
			def m = [:]
			m."a"="a"
			m."b"="b"
			m."c"="c"
		})
		
	}


	public static time(String methodName, Closure clojure){
		long t = new Date().getTime()
		for (int i = 0; i < times; i++) {
			clojure.call()
		}
		long tf = new Date().getTime() - t
		println methodName + ":\t" + tf + "ms"		
	}
}