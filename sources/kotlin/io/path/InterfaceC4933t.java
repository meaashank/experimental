package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.io.path.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "2.1")
@kotlin.O0(markerClass = {InterfaceC4931s.class})
public interface InterfaceC4933t {
    void a(@NotNull ed.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    void b(@NotNull ed.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void c(@NotNull ed.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    void d(@NotNull ed.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);
}
