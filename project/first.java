import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class first{
    public static void main(String[] args) {
        List<Integer> lisname = new ArrayList<>();       
        lisname.add(1);
        lisname.add(2);
        lisname.add(3);
        lisname.add(4);
        lisname.add(1);
        lisname.add(2);
        lisname.add(3);
        lisname.add(4);
        Set<Integer> setting = new HashSet<>();
        for(int i: lisname)
            setting.add(i);
        System.out.println(setting);
    }
}