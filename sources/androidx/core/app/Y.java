package androidx.core.app;

import B0.C0920d;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class Y implements Iterable<Intent> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f111009c = "TaskStackBuilder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Intent> f111010a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f111011b;

    public interface a {
        @Nullable
        Intent getSupportParentActivityIntent();
    }

    public Y(Context context) {
        this.f111011b = context;
    }

    @NonNull
    public static Y j(@NonNull Context context) {
        return new Y(context);
    }

    @Deprecated
    public static Y n(Context context) {
        return new Y(context);
    }

    @NonNull
    public Y b(@NonNull Intent intent) {
        this.f111010a.add(intent);
        return this;
    }

    @NonNull
    public Y c(@NonNull Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f111011b.getPackageManager());
        }
        if (component != null) {
            h(component);
        }
        b(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public Y g(@NonNull Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = z.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f111011b.getPackageManager());
            }
            h(component);
            b(supportParentActivityIntent);
        }
        return this;
    }

    @NonNull
    public Y h(@NonNull ComponentName componentName) {
        int size = this.f111010a.size();
        try {
            Intent intentB = z.b(this.f111011b, componentName);
            while (intentB != null) {
                this.f111010a.add(size, intentB);
                intentB = z.b(this.f111011b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f111009c, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @NonNull
    public Y i(@NonNull Class<?> cls) {
        h(new ComponentName(this.f111011b, cls));
        return this;
    }

    @Override // java.lang.Iterable
    @NonNull
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f111010a.iterator();
    }

    @Nullable
    public Intent k(int i10) {
        return this.f111010a.get(i10);
    }

    @Deprecated
    public Intent o(int i10) {
        return k(i10);
    }

    public int q() {
        return this.f111010a.size();
    }

    @NonNull
    public Intent[] s() {
        int size = this.f111010a.size();
        Intent[] intentArr = new Intent[size];
        if (size != 0) {
            intentArr[0] = new Intent(this.f111010a.get(0)).addFlags(268484608);
            for (int i10 = 1; i10 < size; i10++) {
                intentArr[i10] = new Intent(this.f111010a.get(i10));
            }
        }
        return intentArr;
    }

    @Nullable
    public PendingIntent t(int i10, int i11) {
        return v(i10, i11, null);
    }

    @Nullable
    public PendingIntent v(int i10, int i11, @Nullable Bundle bundle) {
        if (this.f111010a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f111010a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f111011b, i10, intentArr, i11, bundle);
    }

    public void w() {
        x(null);
    }

    public void x(@Nullable Bundle bundle) {
        if (this.f111010a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f111010a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C0920d.startActivities(this.f111011b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f111011b.startActivity(intent);
    }
}
