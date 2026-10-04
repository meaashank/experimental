package B0;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class H {

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static a f12256b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0008a f12257a = new C0008a();

        /* JADX INFO: renamed from: B0.H$a$a, reason: collision with other inner class name */
        public static class C0008a {
            public void a(@NonNull SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        public static a b() {
            if (f12256b == null) {
                f12256b = new a();
            }
            return f12256b;
        }

        @Deprecated
        public void a(@NonNull SharedPreferences.Editor editor) {
            this.f12257a.a(editor);
        }
    }
}
