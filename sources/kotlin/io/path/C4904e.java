package kotlin.io.path;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.io.path.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4931s
public final class C4904e implements InterfaceC4896a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4904e f217825a = new C4904e();

    @Override // kotlin.io.path.InterfaceC4896a
    @NotNull
    public CopyActionResult a(@NotNull Path path, @NotNull Path target, boolean z10) {
        kotlin.jvm.internal.G.p(path, "<this>");
        kotlin.jvm.internal.G.p(target, "target");
        LinkOption[] linkOptionArrA = C4943y.f217842a.a(z10);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrA, linkOptionArrA.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !Files.isDirectory(target, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(linkOptionArrA, linkOptionArrA.length);
            kotlin.jvm.internal.G.o(Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
        }
        return CopyActionResult.CONTINUE;
    }
}
