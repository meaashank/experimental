package w;

import B0.C0920d;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Intent f240001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<Uri> f240002b;

    public v(@NonNull Intent intent, @NonNull List<Uri> list) {
        this.f240001a = intent;
        this.f240002b = list;
    }

    @NonNull
    public Intent a() {
        return this.f240001a;
    }

    public final void b(Context context) {
        Iterator<Uri> it = this.f240002b.iterator();
        while (it.hasNext()) {
            context.grantUriPermission(this.f240001a.getPackage(), it.next(), 1);
        }
    }

    public void c(@NonNull Context context) {
        b(context);
        C0920d.startActivity(context, this.f240001a, null);
    }
}
