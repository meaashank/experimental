package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC5361k extends c0, WritableByteChannel {
    @NotNull
    InterfaceC5361k A0(long j10) throws IOException;

    @NotNull
    InterfaceC5361k C3(@NotNull String str, @NotNull Charset charset) throws IOException;

    @NotNull
    InterfaceC5361k I1(int i10) throws IOException;

    @NotNull
    InterfaceC5361k K2(@NotNull String str) throws IOException;

    long Q2(@NotNull e0 e0Var) throws IOException;

    @NotNull
    InterfaceC5361k S1(long j10) throws IOException;

    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @InterfaceC4852c0(expression = "buffer", imports = {}))
    @NotNull
    C5360j T();

    @NotNull
    OutputStream V3();

    @NotNull
    InterfaceC5361k W1(@NotNull e0 e0Var, long j10) throws IOException;

    @NotNull
    InterfaceC5361k Y0(@NotNull String str, int i10, int i11) throws IOException;

    @NotNull
    InterfaceC5361k e2(@NotNull ByteString byteString) throws IOException;

    @Override // okio.c0, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    C5360j getBuffer();

    @NotNull
    InterfaceC5361k i1(@NotNull String str, int i10, int i11, @NotNull Charset charset) throws IOException;

    @NotNull
    InterfaceC5361k k1(long j10) throws IOException;

    @NotNull
    InterfaceC5361k q2() throws IOException;

    @NotNull
    InterfaceC5361k s2(int i10) throws IOException;

    @NotNull
    InterfaceC5361k u1(@NotNull ByteString byteString, int i10, int i11) throws IOException;

    @NotNull
    InterfaceC5361k write(@NotNull byte[] bArr) throws IOException;

    @NotNull
    InterfaceC5361k write(@NotNull byte[] bArr, int i10, int i11) throws IOException;

    @NotNull
    InterfaceC5361k writeByte(int i10) throws IOException;

    @NotNull
    InterfaceC5361k writeInt(int i10) throws IOException;

    @NotNull
    InterfaceC5361k writeLong(long j10) throws IOException;

    @NotNull
    InterfaceC5361k writeShort(int i10) throws IOException;

    @NotNull
    InterfaceC5361k x2() throws IOException;

    @NotNull
    InterfaceC5361k y1(int i10) throws IOException;
}
