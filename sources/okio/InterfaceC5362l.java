package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: okio.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC5362l extends e0, ReadableByteChannel {
    @NotNull
    String A2(long j10) throws IOException;

    long D0(@NotNull ByteString byteString) throws IOException;

    int F3() throws IOException;

    long H0(byte b10, long j10) throws IOException;

    long I0(@NotNull ByteString byteString) throws IOException;

    @Nullable
    String K0() throws IOException;

    @NotNull
    String O1(@NotNull Charset charset) throws IOException;

    int R1() throws IOException;

    boolean S0(long j10, @NotNull ByteString byteString) throws IOException;

    @NotNull
    String S2() throws IOException;

    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @InterfaceC4852c0(expression = "buffer", imports = {}))
    @NotNull
    C5360j T();

    @NotNull
    ByteString T1() throws IOException;

    boolean U2(long j10, @NotNull ByteString byteString, int i10, int i11) throws IOException;

    @NotNull
    byte[] W2(long j10) throws IOException;

    int W3(@NotNull T t10) throws IOException;

    @NotNull
    String a2() throws IOException;

    @NotNull
    String b2(long j10, @NotNull Charset charset) throws IOException;

    short e1() throws IOException;

    long g1() throws IOException;

    long g2(@NotNull c0 c0Var) throws IOException;

    @NotNull
    C5360j getBuffer();

    long i2() throws IOException;

    void i3(long j10) throws IOException;

    @NotNull
    InputStream inputStream();

    long j1(@NotNull ByteString byteString, long j10) throws IOException;

    long m1(byte b10) throws IOException;

    @NotNull
    String n1(long j10) throws IOException;

    @NotNull
    InterfaceC5362l peek();

    boolean r3() throws IOException;

    int read(@NotNull byte[] bArr) throws IOException;

    int read(@NotNull byte[] bArr, int i10, int i11) throws IOException;

    byte readByte() throws IOException;

    void readFully(@NotNull byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j10) throws IOException;

    @NotNull
    ByteString s1(long j10) throws IOException;

    void skip(long j10) throws IOException;

    long u3() throws IOException;

    void v2(@NotNull C5360j c5360j, long j10) throws IOException;

    @NotNull
    byte[] w1() throws IOException;

    long w2(byte b10, long j10, long j11) throws IOException;

    long x(@NotNull ByteString byteString, long j10) throws IOException;
}
