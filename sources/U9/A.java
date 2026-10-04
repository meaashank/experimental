package U9;

import com.android.launcher3.extension.DeleteDropTargetExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static A f73884b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<a> f73885a = new ArrayList();

    public interface a {
        DeleteDropTargetExtension a(String str);
    }

    public static A b() {
        if (f73884b == null) {
            synchronized (A.class) {
                try {
                    if (f73884b == null) {
                        f73884b = new A();
                    }
                } finally {
                }
            }
        }
        return f73884b;
    }

    public DeleteDropTargetExtension a(String str) {
        Iterator<a> it = this.f73885a.iterator();
        while (it.hasNext()) {
            DeleteDropTargetExtension deleteDropTargetExtensionA = it.next().a(str);
            if (deleteDropTargetExtensionA != null) {
                return deleteDropTargetExtensionA;
            }
        }
        return null;
    }

    public void c(a aVar) {
        this.f73885a.add(aVar);
    }
}
