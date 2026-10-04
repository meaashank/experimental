package G7;

import android.view.inputmethod.EditorInfo;
import c7.m;
import com.prism.commons.utils.C3838b;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    public static class a extends C0041b {
        @Override // G7.b.C0041b, c7.m
        public String A() {
            return "startInput";
        }
    }

    /* JADX INFO: renamed from: G7.b$b, reason: collision with other inner class name */
    public static class C0041b extends m {
        @Override // c7.m
        public String A() {
            return "startInputOrWindowGainedFocus";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            int iJ = C3838b.j(objArr, EditorInfo.class);
            if (iJ != -1) {
                ((EditorInfo) objArr[iJ]).packageName = m.w();
            }
            return method.invoke(obj, objArr);
        }
    }

    public static class c extends C0041b {
        @Override // G7.b.C0041b, c7.m
        public String A() {
            return "startInputOrWindowGainedFocusAsync";
        }
    }

    public static class d extends C0041b {
        @Override // G7.b.C0041b, c7.m
        public String A() {
            return "windowGainedFocus";
        }
    }
}
