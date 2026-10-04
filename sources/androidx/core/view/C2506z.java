package androidx.core.view;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: androidx.core.view.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2506z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DragAndDropPermissions f111973a;

    /* JADX INFO: renamed from: androidx.core.view.z$a */
    @e.T(24)
    public static class a {
        public static void a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        public static DragAndDropPermissions b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    public C2506z(DragAndDropPermissions dragAndDropPermissions) {
        this.f111973a = dragAndDropPermissions;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static C2506z b(@NonNull Activity activity, @NonNull DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsB;
        if (Build.VERSION.SDK_INT < 24 || (dragAndDropPermissionsB = a.b(activity, dragEvent)) == null) {
            return null;
        }
        return new C2506z(dragAndDropPermissionsB);
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            a.a(this.f111973a);
        }
    }
}
