package com.google.android.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.AtomicFile;
import com.google.android.exoplayer2.util.ReusableBufferedOutputStream;
import com.google.android.exoplayer2.util.Util;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
class CachedContentIndex {
    public static final String FILE_NAME = "cached_content_index.exi";
    private static final int FLAG_ENCRYPTED_INDEX = 1;
    private static final String TAG = "CachedContentIndex";
    private static final int VERSION = 2;
    private final AtomicFile atomicFile;
    private ReusableBufferedOutputStream bufferedOutputStream;
    private boolean changed;
    private final Cipher cipher;
    private final boolean encrypt;
    private final SparseArray<String> idToKey;
    private final HashMap<String, CachedContent> keyToContent;
    private final SecretKeySpec secretKeySpec;

    public CachedContentIndex(File file) {
        this(file, null);
    }

    private void add(CachedContent cachedContent) {
        this.keyToContent.put(cachedContent.key, cachedContent);
        this.idToKey.put(cachedContent.f150753id, cachedContent.key);
    }

    private CachedContent addNew(String str) {
        CachedContent cachedContent = new CachedContent(getNewId(this.idToKey), str);
        add(cachedContent);
        this.changed = true;
        return cachedContent;
    }

    private static Cipher getCipher() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (Util.SDK_INT == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    public static int getNewId(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i10 < size && i10 == sparseArray.keyAt(i10)) {
            i10++;
        }
        return i10;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x004f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:80), block:B:20:0x004f */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean readFile() throws java.lang.Throwable {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f java.io.FileNotFoundException -> La5
            com.google.android.exoplayer2.util.AtomicFile r3 = r9.atomicFile     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f java.io.FileNotFoundException -> La5
            java.io.InputStream r3 = r3.openRead()     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f java.io.FileNotFoundException -> La5
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f java.io.FileNotFoundException -> La5
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f java.io.FileNotFoundException -> La5
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f java.io.FileNotFoundException -> La5
            int r1 = r3.readInt()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            if (r1 < 0) goto L89
            r4 = 2
            if (r1 <= r4) goto L1d
            goto L89
        L1d:
            int r5 = r3.readInt()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L5e
            javax.crypto.Cipher r5 = r9.cipher     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            if (r5 != 0) goto L2d
            com.google.android.exoplayer2.util.Util.closeQuietly(r3)
            return r0
        L2d:
            r5 = 16
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r3.readFully(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            javax.crypto.Cipher r5 = r9.cipher     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.InvalidKeyException -> L57
            javax.crypto.spec.SecretKeySpec r8 = r9.secretKeySpec     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.InvalidKeyException -> L57
            r5.init(r4, r8, r7)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.InvalidKeyException -> L57
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            javax.crypto.CipherInputStream r5 = new javax.crypto.CipherInputStream     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            javax.crypto.Cipher r7 = r9.cipher     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r5.<init>(r2, r7)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r3 = r4
            goto L64
        L4e:
            r0 = move-exception
            r1 = r3
            goto L9f
        L51:
            r1 = move-exception
            goto L92
        L53:
            r1 = r3
            goto La5
        L55:
            r1 = move-exception
            goto L58
        L57:
            r1 = move-exception
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            throw r2     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
        L5e:
            boolean r2 = r9.encrypt     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            if (r2 == 0) goto L64
            r9.changed = r6     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
        L64:
            int r2 = r3.readInt()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r4 = r0
            r5 = r4
        L6a:
            if (r4 >= r2) goto L7b
            com.google.android.exoplayer2.upstream.cache.CachedContent r7 = com.google.android.exoplayer2.upstream.cache.CachedContent.readFromStream(r1, r3)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r9.add(r7)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            int r7 = r7.headerHashCode(r1)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            int r5 = r5 + r7
            int r4 = r4 + 1
            goto L6a
        L7b:
            int r1 = r3.readInt()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            if (r1 == r5) goto L85
            com.google.android.exoplayer2.util.Util.closeQuietly(r3)
            return r0
        L85:
            com.google.android.exoplayer2.util.Util.closeQuietly(r3)
            return r6
        L89:
            com.google.android.exoplayer2.util.Util.closeQuietly(r3)
            return r0
        L8d:
            r0 = move-exception
            goto L9f
        L8f:
            r2 = move-exception
            r3 = r1
            r1 = r2
        L92:
            java.lang.String r2 = "CachedContentIndex"
            java.lang.String r4 = "Error reading cache content index file."
            android.util.Log.e(r2, r4, r1)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L9e
            com.google.android.exoplayer2.util.Util.closeQuietly(r3)
        L9e:
            return r0
        L9f:
            if (r1 == 0) goto La4
            com.google.android.exoplayer2.util.Util.closeQuietly(r1)
        La4:
            throw r0
        La5:
            if (r1 == 0) goto Laa
            com.google.android.exoplayer2.util.Util.closeQuietly(r1)
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CachedContentIndex.readFile():boolean");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void writeFile() throws Throwable {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = null;
        try {
            try {
                OutputStream outputStreamStartWrite = this.atomicFile.startWrite();
                ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
                if (reusableBufferedOutputStream == null) {
                    this.bufferedOutputStream = new ReusableBufferedOutputStream(outputStreamStartWrite);
                } else {
                    reusableBufferedOutputStream.reset(outputStreamStartWrite);
                }
                dataOutputStream = new DataOutputStream(this.bufferedOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.encrypt ? 1 : 0);
            if (this.encrypt) {
                byte[] bArr = new byte[16];
                new Random().nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    this.cipher.init(1, this.secretKeySpec, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(this.bufferedOutputStream, this.cipher));
                } catch (InvalidAlgorithmParameterException e11) {
                    e = e11;
                    throw new IllegalStateException(e);
                } catch (InvalidKeyException e12) {
                    e = e12;
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(this.keyToContent.size());
            int iHeaderHashCode = 0;
            for (CachedContent cachedContent : this.keyToContent.values()) {
                cachedContent.writeToStream(dataOutputStream);
                iHeaderHashCode += cachedContent.headerHashCode(2);
            }
            dataOutputStream.writeInt(iHeaderHashCode);
            this.atomicFile.endWrite(dataOutputStream);
            Util.closeQuietly((Closeable) null);
        } catch (IOException e13) {
            e = e13;
            throw new Cache.CacheException(e);
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            Util.closeQuietly(dataOutputStream2);
            throw th;
        }
    }

    public void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) {
        if (getOrAdd(str).applyMetadataMutations(contentMetadataMutations)) {
            this.changed = true;
        }
    }

    public int assignIdForKey(String str) {
        return getOrAdd(str).f150753id;
    }

    public CachedContent get(String str) {
        return this.keyToContent.get(str);
    }

    public Collection<CachedContent> getAll() {
        return this.keyToContent.values();
    }

    public ContentMetadata getContentMetadata(String str) {
        CachedContent cachedContent = get(str);
        return cachedContent != null ? cachedContent.getMetadata() : DefaultContentMetadata.EMPTY;
    }

    public String getKeyForId(int i10) {
        return this.idToKey.get(i10);
    }

    public Set<String> getKeys() {
        return this.keyToContent.keySet();
    }

    public CachedContent getOrAdd(String str) {
        CachedContent cachedContent = this.keyToContent.get(str);
        return cachedContent == null ? addNew(str) : cachedContent;
    }

    public void load() {
        Assertions.checkState(!this.changed);
        if (readFile()) {
            return;
        }
        this.atomicFile.delete();
        this.keyToContent.clear();
        this.idToKey.clear();
    }

    public void maybeRemove(String str) {
        CachedContent cachedContent = this.keyToContent.get(str);
        if (cachedContent == null || !cachedContent.isEmpty() || cachedContent.isLocked()) {
            return;
        }
        this.keyToContent.remove(str);
        this.idToKey.remove(cachedContent.f150753id);
        this.changed = true;
    }

    public void removeEmpty() {
        int size = this.keyToContent.size();
        String[] strArr = new String[size];
        this.keyToContent.keySet().toArray(strArr);
        for (int i10 = 0; i10 < size; i10++) {
            maybeRemove(strArr[i10]);
        }
    }

    public void store() throws Throwable {
        if (this.changed) {
            writeFile();
            this.changed = false;
        }
    }

    public CachedContentIndex(File file, byte[] bArr) {
        this(file, bArr, bArr != null);
    }

    public CachedContentIndex(File file, byte[] bArr, boolean z10) {
        this.encrypt = z10;
        if (bArr != null) {
            Assertions.checkArgument(bArr.length == 16);
            try {
                this.cipher = getCipher();
                this.secretKeySpec = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            Assertions.checkState(!z10);
            this.cipher = null;
            this.secretKeySpec = null;
        }
        this.keyToContent = new HashMap<>();
        this.idToKey = new SparseArray<>();
        this.atomicFile = new AtomicFile(new File(file, "cached_content_index.exi"));
    }
}
