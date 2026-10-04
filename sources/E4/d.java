package E4;

import android.annotation.TargetApi;
import android.webkit.PermissionRequest;
import androidx.compose.runtime.internal.r;
import ed.l;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.L0;
import kotlin.collections.B;
import kotlin.collections.C4875q;
import kotlin.collections.N;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
@TargetApi(21)
@r(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f28376b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, HashSet<String>> f28377a = new LinkedHashMap();

    @Inject
    public d() {
    }

    public static final L0 e(PermissionRequest permissionRequest, String[] strArr, boolean z10) {
        if (z10) {
            permissionRequest.grant(strArr);
        } else {
            permissionRequest.deny();
        }
        return L0.f217464a;
    }

    public static final L0 f(f fVar, Set set, final PermissionRequest permissionRequest, final d dVar, final String str, final String[] strArr, boolean z10) {
        if (z10) {
            fVar.requestPermissions(set, new l() { // from class: E4.a
                @Override // ed.l
                public final Object invoke(Object obj) {
                    return d.g(this.f28364a, str, strArr, permissionRequest, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            permissionRequest.deny();
        }
        return L0.f217464a;
    }

    public static final L0 g(d dVar, String str, String[] strArr, PermissionRequest permissionRequest, boolean z10) {
        if (z10) {
            HashSet<String> hashSet = dVar.f28377a.get(str);
            if (hashSet != null) {
                G.m(strArr);
                N.u0(hashSet, strArr);
            } else {
                Map<String, HashSet<String>> map = dVar.f28377a;
                G.m(strArr);
                map.put(str, B.Ty(strArr));
            }
            permissionRequest.grant(strArr);
        } else {
            permissionRequest.deny();
        }
        return L0.f217464a;
    }

    public final void d(@NotNull final PermissionRequest permissionRequest, @NotNull final f view) {
        G.p(permissionRequest, "permissionRequest");
        G.p(view, "view");
        String host = permissionRequest.getOrigin().getHost();
        if (host == null) {
            host = "";
        }
        final String str = host;
        final String[] resources = permissionRequest.getResources();
        final Set<String> setA = d4.l.a(permissionRequest);
        HashSet<String> hashSet = this.f28377a.get(str);
        if (hashSet != null) {
            G.m(resources);
            if (hashSet.containsAll(C4875q.t(resources))) {
                view.requestPermissions(setA, new l() { // from class: E4.b
                    @Override // ed.l
                    public final Object invoke(Object obj) {
                        return d.e(permissionRequest, resources, ((Boolean) obj).booleanValue());
                    }
                });
                return;
            }
        }
        G.m(resources);
        view.requestResources(str, resources, new l() { // from class: E4.c
            @Override // ed.l
            public final Object invoke(Object obj) {
                return d.f(view, setA, permissionRequest, this, str, resources, ((Boolean) obj).booleanValue());
            }
        });
    }
}
