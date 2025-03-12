package synchronization;

import java.util.ArrayList;
import java.util.List;

class BlockExample {
    String name = "";
    public int count = 0;

    // method whereonly a block is synchronized
    public void getName(String blockName, List<String> list) {
        // only one thread is allowed to change the name at a time
        synchronized (this) {
            name = blockName;

            // keep count of how many threads have changed the name
            count++;
        }

        list.add(blockName);
    }
}

public class BlockSync {
    public static void main(String[] args) {
        BlockExample blockex = new BlockExample();
        List<String> list = new ArrayList<String>();
        blockex.getName("John", list);

        System.out.println(blockex.name);
    }
}
