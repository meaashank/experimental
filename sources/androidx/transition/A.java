package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f117612b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f117611a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<Transition> f117613c = new ArrayList<>();

    @Deprecated
    public A() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f117612b == a10.f117612b && this.f117611a.equals(a10.f117611a);
    }

    public int hashCode() {
        return this.f117611a.hashCode() + (this.f117612b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbA = android.support.v4.media.f.a("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbA.append(this.f117612b);
        sbA.append("\n");
        String strA = androidx.compose.runtime.changelist.j.a(sbA.toString(), "    values:");
        for (String str : this.f117611a.keySet()) {
            strA = strA + TextProcessor.f150538k0 + str + ": " + this.f117611a.get(str) + "\n";
        }
        return strA;
    }

    public A(@NonNull View view) {
        this.f117612b = view;
    }
}
