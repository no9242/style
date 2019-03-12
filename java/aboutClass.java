import java.util.ArrayList;
import java.util.Iterator;

public class aboutClass {
    /**
     * AboutArrayList
     * 用智能ide导入工程, 会显示ArrayList的所有方法,各个测试
     * 再加上自定义的方法,扩展ArrayList,地址项目所以需要的class
     */
    public class AboutArrayList extends ArrayList {
        /**
         * 一旦扩展了官方的类,就要声明serialVersionUID,用来给系统检测兼容性
         */
        private static final long serialVersionUID = 1L;


        /**
         * 检测数组是否全为int
         */
        public boolean isInt() {
            Iterator iterator = iterator();
            while (iterator.hasNext()) {
                if (!(iterator.next() instanceof Integer)) {
                    return false;
                }
            }
            return true;
        }
    }
}

