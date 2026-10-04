package com.prism.lib.pfs.compat;

import androidx.annotation.Nullable;
import com.prism.lib.pfs.exception.PfsIOException;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import java.util.List;
import o6.l;

/* JADX INFO: loaded from: classes7.dex */
public interface PfsCompatExtFile extends ExchangeFile {
    boolean createNewFile() throws PfsIOException;

    boolean delete() throws PfsIOException;

    boolean existValidChild(boolean z10);

    @Override // com.prism.lib.pfs.file.exchange.ExchangeFile
    boolean exists();

    PfsCompatExtFile getParent();

    String getRealPath();

    String getRelativePath();

    boolean isDirectory();

    List<PfsCompatExtFile> list();

    void mkDirs() throws PfsIOException;

    void mkParentDirs() throws PfsIOException;

    boolean move(PfsCompatExtFile pfsCompatExtFile);

    PfsCompatExtFile refer(String str);

    boolean rename(String str);

    boolean rmEmptySubDirs();

    PfsCompatExtFile sync(boolean z10);

    boolean walk(l<PfsCompatExtFile> lVar, @Nullable o6.k kVar);
}
