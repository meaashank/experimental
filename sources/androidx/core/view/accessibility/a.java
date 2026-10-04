package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: androidx.core.view.accessibility.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0286a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bundle f111902a;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(@Nullable Bundle bundle) {
            this.f111902a = bundle;
        }
    }

    public static final class b extends AbstractC0286a {
        public boolean b() {
            return this.f111902a.getBoolean(AccessibilityNodeInfoCompat.f111788Y);
        }

        public int c() {
            return this.f111902a.getInt(AccessibilityNodeInfoCompat.f111786W);
        }
    }

    public static final class c extends AbstractC0286a {
        @Nullable
        public String b() {
            return this.f111902a.getString(AccessibilityNodeInfoCompat.f111787X);
        }
    }

    public static final class d extends AbstractC0286a {
        public int b() {
            return this.f111902a.getInt(AccessibilityNodeInfoCompat.f111798f0);
        }

        public int c() {
            return this.f111902a.getInt(AccessibilityNodeInfoCompat.f111800g0);
        }
    }

    public static final class e extends AbstractC0286a {
        public int b() {
            return this.f111902a.getInt(AccessibilityNodeInfoCompat.f111794d0);
        }

        public int c() {
            return this.f111902a.getInt(AccessibilityNodeInfoCompat.f111792c0);
        }
    }

    public static final class f extends AbstractC0286a {
        public float b() {
            return this.f111902a.getFloat(AccessibilityNodeInfoCompat.f111796e0);
        }
    }

    public static final class g extends AbstractC0286a {
        public int b() {
            return this.f111902a.getInt(AccessibilityNodeInfoCompat.f111790a0);
        }

        public int c() {
            return this.f111902a.getInt(AccessibilityNodeInfoCompat.f111789Z);
        }
    }

    public static final class h extends AbstractC0286a {
        @Nullable
        public CharSequence b() {
            return this.f111902a.getCharSequence(AccessibilityNodeInfoCompat.f111791b0);
        }
    }

    boolean perform(@NonNull View view, @Nullable AbstractC0286a abstractC0286a);
}
