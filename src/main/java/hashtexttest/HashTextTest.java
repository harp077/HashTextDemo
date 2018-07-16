package hashtexttest;

import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

public class HashTextTest {

    public static String GetTextHash(String buf, String Tip) {
        if (!buf.isEmpty()) {
            switch (Tip) {
                case "md2":    return DigestUtils.md2Hex(buf);
                case "md5":    return DigestUtils.md5Hex(buf);
                case "sha1":   return DigestUtils.sha1Hex(buf);
                case "sha256": return DigestUtils.sha256Hex(buf);
                case "sha384": return DigestUtils.sha384Hex(buf);
                case "sha512": return DigestUtils.sha512Hex(buf);
                default:       return "wrong hash type";
            }
        } else {
            JOptionPane.showMessageDialog(null, "'Input Text' is empty !");
        }
        return "some error";
    }

    public static void main(String[] args) {
        String tip = JOptionPane.showInputDialog("input Hash Type:");
        String str = JOptionPane.showInputDialog("input string for hash:");
        JOptionPane.showMessageDialog(null, GetTextHash(str, tip));
    }

}
