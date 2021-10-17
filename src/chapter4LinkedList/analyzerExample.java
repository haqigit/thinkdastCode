package chapter4LinkedList;

import java.util.List;
import org.jfree.data.xy.XYSeries;

import chapter3ArrayList.MyArrayList;
import chapter4LinkedList.Profiler.Timeable;

public class analyzerExample {
	public static void profileArrayListAddEnd() {
		Timeable timeable = new Timeable() {
			List<String> list;

			public void setup(int n) {
				list = new MyArrayList<String>();
			}

			public void timeMe(int n) {
				for (int i = 0; i < n; i++) {
					list.add("a string");
				}
			}
		};

		String title = "ArrayList add end";
		Profiler profiler = new Profiler(title, timeable);

		int startN = 4000;
		int endMillis = 1000;
		XYSeries series = profiler.timingLoop(startN, endMillis);
		profiler.plotResults(series);
	}

}
