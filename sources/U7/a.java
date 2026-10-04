package U7;

import android.os.IInterface;
import androidx.annotation.NonNull;
import c7.C2953e;
import c7.InterfaceC2957i;
import c7.J;
import c7.m;
import com.prism.gaia.helper.compat.f;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class a extends E7.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f73880i = "asdf-".concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: U7.a$a, reason: collision with other inner class name */
    public static class C0119a extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f73881d;

        public C0119a(String str) {
            this.f73881d = str;
        }

        @Override // c7.m
        public String A() {
            return this.f73881d;
        }

        @Override // c7.m
        public boolean P() {
            return m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) {
            return f.d(method, new ArrayList(0));
        }
    }

    public static class b extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f73882d;

        public b(String str) {
            this.f73882d = str;
        }

        @Override // c7.m
        public String A() {
            return this.f73882d;
        }

        @Override // c7.m
        public boolean P() {
            return m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) {
            String unused = a.f73880i;
            throw new IllegalArgumentException("Conversation does not exist");
        }
    }

    public a() {
        super("people", "android.app.people.IPeopleManager", new InterfaceC2957i[0]);
    }

    @Override // E7.a, c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        super.d(c2953e);
        c2953e.f(new b("addOrUpdateStatus"));
        c2953e.f(new C0119a("getStatuses"));
        c2953e.f(new C0119a("getRecentConversations"));
        c2953e.f(new J("getConversation", null));
        c2953e.f(new J("isConversation", Boolean.FALSE));
        c2953e.f(new J("getLastInteraction", 0L));
        String[] strArr = {"clearStatus", "clearStatuses", "removeRecentConversation", "removeAllRecentConversations"};
        for (int i10 = 0; i10 < 4; i10++) {
            c2953e.f(new J(strArr[i10], null));
        }
    }
}
