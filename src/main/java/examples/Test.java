
package examples;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : wangyulong
 * @since: 2018/5/25 11:56
 */
public class Test {

    public static void main(String args[]) {
        //master mofigy 1
        FileReader reader = null;
        BufferedReader br = null;
        FileWriter writer = null;
        BufferedWriter bw = null;
        try {
            reader = new FileReader("/Users/wangyulong/Documents/working/orderFlow.txt");
            br = new BufferedReader(reader);
            StringBuilder sb = new StringBuilder("");
            String str = null;
            List<String> result = new ArrayList<String>();
            while ((str = br.readLine()) != null) {
                result.add(str);
            }
            for(int j = 0; j < 8; j++){
                try {
                    StringBuilder sbb = new StringBuilder("");
                    writer = new FileWriter("/Users/wangyulong/Documents/working/o"+j+".txt");
                    bw = new BufferedWriter(writer);
                    for (int i = 0; i < 125; i++) {
                        for (String ss: result) {
                            if (ss.contains("order_flow_xxx")) {
                                ss = ss.replace("xxx", "" + (j * 125 + i));
                            }
                            sbb.append(ss).append("\n");
                        }

                    }
                    bw.write(sbb.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    try {
                        bw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

}
