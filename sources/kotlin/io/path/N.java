package kotlin.io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class N {
    public static final boolean c(C4945z c4945z) {
        Object obj;
        for (C4945z c4945z2 = c4945z.f217849c; c4945z2 != null; c4945z2 = c4945z2.f217849c) {
            Object obj2 = c4945z2.f217848b;
            if (obj2 == null || (obj = c4945z.f217848b) == null) {
                try {
                    if (Files.isSameFile(c4945z2.f217847a, c4945z.f217847a)) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (kotlin.jvm.internal.G.g(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static final Object d(Path path, LinkOption[] linkOptionArr) {
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            kotlin.jvm.internal.G.o(attributes, "readAttributes(...)");
            return attributes.fileKey();
        } catch (Throwable unused) {
            return null;
        }
    }
}
