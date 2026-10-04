package Q0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f65717a = "tree";

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f65718a = 512;
    }

    @T(21)
    public static class b {
        public static Uri a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        public static Uri b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        public static Uri c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        public static Uri d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        public static Uri e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        public static String f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        public static Uri g(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    /* JADX INFO: renamed from: Q0.c$c, reason: collision with other inner class name */
    @T(24)
    public static class C0097c {
        public static boolean a(@NonNull Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        public static boolean b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    @Nullable
    public static Uri a(@NonNull String str, @Nullable String str2) {
        return DocumentsContract.buildChildDocumentsUri(str, str2);
    }

    @Nullable
    public static Uri b(@NonNull Uri uri, @NonNull String str) {
        return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
    }

    @Nullable
    public static Uri c(@NonNull String str, @NonNull String str2) {
        return DocumentsContract.buildDocumentUri(str, str2);
    }

    @Nullable
    public static Uri d(@NonNull Uri uri, @NonNull String str) {
        return DocumentsContract.buildDocumentUriUsingTree(uri, str);
    }

    @Nullable
    public static Uri e(@NonNull String str, @NonNull String str2) {
        return DocumentsContract.buildTreeDocumentUri(str, str2);
    }

    @Nullable
    public static Uri f(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str, @NonNull String str2) throws FileNotFoundException {
        return DocumentsContract.createDocument(contentResolver, uri, str, str2);
    }

    @Nullable
    public static String g(@NonNull Uri uri) {
        return DocumentsContract.getDocumentId(uri);
    }

    @Nullable
    public static String h(@NonNull Uri uri) {
        return DocumentsContract.getTreeDocumentId(uri);
    }

    public static boolean i(@NonNull Context context, @Nullable Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public static boolean j(@NonNull Uri uri) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0097c.a(uri);
        }
        List<String> pathSegments = uri.getPathSegments();
        return pathSegments.size() >= 2 && f65717a.equals(pathSegments.get(0));
    }

    public static boolean k(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull Uri uri2) throws FileNotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? C0097c.b(contentResolver, uri, uri2) : DocumentsContract.deleteDocument(contentResolver, uri);
    }

    @Nullable
    public static Uri l(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        return DocumentsContract.renameDocument(contentResolver, uri, str);
    }
}
