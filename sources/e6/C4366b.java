package e6;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import d.C4283b;

/* JADX INFO: renamed from: e6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C4366b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.activity.result.g<Intent> f200251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f200252b;

    /* JADX INFO: renamed from: e6.b$a */
    public interface a {
        void a(int i10, @Nullable Intent intent);
    }

    public C4366b(@NonNull ActivityC1486c activityC1486c) {
        this.f200251a = activityC1486c.registerForActivityResult(new C4283b.m(), new androidx.activity.result.a() { // from class: e6.a
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                this.f200250a.a((ActivityResult) obj);
            }
        });
    }

    public void a(ActivityResult activityResult) {
        a aVar = this.f200252b;
        if (aVar == null) {
            return;
        }
        aVar.a(activityResult.getResultCode(), activityResult.getData());
    }

    public void b(@NonNull Activity activity, Intent intent, a aVar) {
        this.f200252b = aVar;
        try {
            this.f200251a.b(intent);
        } catch (Throwable th) {
            this.f200252b = null;
            throw th;
        }
    }

    public C4366b(androidx.activity.result.g<Intent> gVar) {
        this.f200251a = gVar;
    }
}
