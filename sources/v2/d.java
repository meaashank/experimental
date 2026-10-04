package v2;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import e.T;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface d extends Closeable {
    @NotNull
    Cursor A3(@NotNull String str);

    boolean C2();

    @T(api = 16)
    void D1(boolean z10);

    void D2();

    void E2(@NotNull String str, @NotNull Object[] objArr) throws SQLException;

    long G2(long j10);

    void G3(@NotNull SQLiteTransactionListener sQLiteTransactionListener);

    long H1();

    boolean H3();

    @T(api = 16)
    @NotNull
    Cursor J0(@NotNull f fVar, @Nullable CancellationSignal cancellationSignal);

    void M2(@NotNull SQLiteTransactionListener sQLiteTransactionListener);

    @T(api = 16)
    boolean M3();

    void N2();

    void O3(int i10);

    void P0();

    long Q1(@NotNull String str, int i10, @NotNull ContentValues contentValues) throws SQLException;

    void Q3(long j10);

    boolean V0();

    boolean W0();

    boolean Z0(int i10);

    @NotNull
    Cursor c3(@NotNull f fVar);

    long getPageSize();

    @Nullable
    String getPath();

    int getVersion();

    void h3(@NotNull String str, @SuppressLint({"ArrayReturn"}) @Nullable Object[] objArr);

    boolean isOpen();

    boolean l3(long j10);

    void n3(int i10);

    void o2(@NotNull String str) throws SQLException;

    @NotNull
    h p3(@NotNull String str);

    @NotNull
    Cursor q1(@NotNull String str, @NotNull Object[] objArr);

    boolean r2();

    void s0();

    boolean s3();

    void setLocale(@NotNull Locale locale);

    @Nullable
    List<Pair<String, String>> u0();

    int v(@NotNull String str, @Nullable String str2, @Nullable Object[] objArr);

    @T(api = 16)
    void w0();

    int w3(@NotNull String str, int i10, @NotNull ContentValues contentValues, @Nullable String str2, @Nullable Object[] objArr);

    boolean z3();
}
