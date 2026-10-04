package com.android.launcher3.userevent.nano;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface LauncherLogExtensions {

    public static final class LauncherEventExtension extends MessageNano {
        private static volatile LauncherEventExtension[] _emptyArray;

        public LauncherEventExtension() {
            clear();
        }

        public static LauncherEventExtension[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LauncherEventExtension[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static LauncherEventExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LauncherEventExtension) MessageNano.mergeFrom(new LauncherEventExtension(), bArr);
        }

        public LauncherEventExtension clear() {
            this.cachedSize = -1;
            return this;
        }

        public static LauncherEventExtension parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new LauncherEventExtension().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public LauncherEventExtension mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int tag;
            do {
                tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
            } while (WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag));
            return this;
        }
    }

    public static final class TargetExtension extends MessageNano {
        private static volatile TargetExtension[] _emptyArray;

        public TargetExtension() {
            clear();
        }

        public static TargetExtension[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new TargetExtension[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static TargetExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (TargetExtension) MessageNano.mergeFrom(new TargetExtension(), bArr);
        }

        public TargetExtension clear() {
            this.cachedSize = -1;
            return this;
        }

        public static TargetExtension parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new TargetExtension().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public TargetExtension mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            int tag;
            do {
                tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
            } while (WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag));
            return this;
        }
    }
}
