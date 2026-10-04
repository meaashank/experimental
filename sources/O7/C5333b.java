package o7;

import android.app.assist.AssistStructure;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.metadata.android.app.assist.AssistStructureCAG;

/* JADX INFO: renamed from: o7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C5333b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f223349a = "asdf-".concat(C5333b.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f223350b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f223351c;

    public static int a(Object obj) {
        String strR;
        if (!(obj instanceof AssistStructure) || (strR = GaiaContext.j().r()) == null) {
            return 0;
        }
        AssistStructure assistStructure = (AssistStructure) obj;
        try {
            int windowNodeCount = assistStructure.getWindowNodeCount();
            f223351c = 0;
            int iB = 0;
            for (int i10 = 0; i10 < windowNodeCount; i10++) {
                AssistStructure.WindowNode windowNodeAt = assistStructure.getWindowNodeAt(i10);
                if (windowNodeAt != null) {
                    AssistStructure.ViewNode rootViewNode = windowNodeAt.getRootViewNode();
                    if (i10 == 0) {
                        System.identityHashCode(assistStructure);
                        System.identityHashCode(windowNodeAt);
                        System.identityHashCode(rootViewNode);
                    }
                    iB += b(rootViewNode, strR, 0);
                }
            }
            return iB;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int b(AssistStructure.ViewNode viewNode, String str, int i10) {
        int iB;
        String strB;
        if (viewNode == null || i10 > 64) {
            return 0;
        }
        String webDomain = viewNode.getWebDomain();
        if (C5334c.c(webDomain) || (strB = C5334c.b(str, webDomain)) == null) {
            iB = 0;
        } else {
            AssistStructureCAG.f165420G.ViewNode.mWebDomain().set(viewNode, strB);
            if (strB.equals(viewNode.getWebDomain())) {
                iB = 1;
            } else {
                f223351c++;
                iB = 0;
            }
        }
        int childCount = viewNode.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            iB += b(viewNode.getChildAt(i11), str, i10 + 1);
        }
        return iB;
    }
}
