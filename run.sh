#!/usr/bin/env bash
set -e

FX_LIB="$HOME/lib/javafx-sdk-21.0.6/lib"
SRC_DIR="src"
BIN_DIR="bin"

# 1. Preparar pastas
mkdir -p "$BIN_DIR"

# 2. Sincronizar FXML, CSS e imagens preservando a hierarquia
find "$SRC_DIR" -type f \( -name "*.fxml" -o -name "*.css" -o -name "*.png" -o -name "*.jpg" \) | while read -r file; do
  rel_path="${file#$SRC_DIR/}"
  dest_dir="$BIN_DIR/$(dirname "$rel_path")"
  mkdir -p "$dest_dir"
  cp -f "$file" "$dest_dir/"
done

# 3. Compilar classes Java
javac --module-path "$FX_LIB" \
  --add-modules javafx.controls,javafx.fxml \
  -d "$BIN_DIR" \
  $(find "$SRC_DIR" -name "*.java" ! -name "module-info.java")

# 4. Executar via classpath
java --module-path "$FX_LIB" \
  --add-modules javafx.controls,javafx.fxml \
  --enable-native-access=ALL-UNNAMED,javafx.graphics \
  --sun-misc-unsafe-memory-access=allow \
  -Djava.library.path="$FX_LIB" \
  -cp "$BIN_DIR" \
  application.Main 2> >(grep -v -E "javafx.fxml.FXMLLoader|sun.misc.Unsafe|WARNING|ADVERTÊNCIA" >&2)
