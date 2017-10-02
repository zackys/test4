# test4

# 0. 事前準備

以下の01～03まで行ってください。

## 01. Neo4jのインストールと動作確認

### ■[システム要件](https://neo4j.com/docs/operations-manual/current/installation/requirements/)

* Java
  * OpenJDK 8 or Oracle Java 8
  * IBM Java 8

以下、オンラインドキュメントのハードウェア要件を転記します。
推奨値も併記しますが、今回のハンズオンではそこまでのスペックは必要ないと思います。
* CPU:Intel Corei3
  * 推奨：Intel Core i7/IBM POWER8
* Memory:2GB
  * 推奨：16～32GB or more
* DISK:10GB SATA
  * SSD w/ SATA

### ■Javaのインストール

システム要件に記載のJavaをインストールし、PATHにjavaコマンドを通して下さい。

### ■[Neo4jのインストール](https://neo4j.com/docs/operations-manual/current/installation/)

Enterprise版とCommunity版がありますが、Community版をインストールして下さい。

以下のオンラインドキュメントに従い、インストールして下さい：

* Linux: https://neo4j.com/docs/operations-manual/current/installation/linux/tarball/
* MacOS: https://neo4j.com/docs/operations-manual/current/installation/osx/
* Windows: https://neo4j.com/docs/operations-manual/current/installation/windows/

その他

* インストール手順は「パッケージ管理ツールの実行」または「インストーラのダウンロードとインストーラの実行」という（簡単な）手順です。
* ドキュメントには、コンソールアプリケーション(Neo4jサーバ)の起動と終了までの案内があります。今回はそこまででOKです。
  * Linux:2.2.4.1.まで
  * MacOS:2.3.2.まで
  * Windows：2.4.2まで
* Neo4jのサービス登録は、今回のハンズオンでは不要です。

### ■動作確認

* Neo4jを起動する
* ブラウザを起動し、http://localhost:7474 へアクセスする
* 以下のような画面が表示されるので、password欄に「neo4j」と入力し、「Connect」ボタンを押下する
![inst01](https://user-images.githubusercontent.com/5683857/31061618-1db38b78-a75e-11e7-94a5-9392be101607.jpg)
* 以下のような画面が表示されるので、新しいpasswordを入力し、「Change password」ボタンを押下する
  * この時の「ユーザー」と「パスワード」はハンズオンで使用するので、覚えておく
![inst02](https://user-images.githubusercontent.com/5683857/31061685-c411563a-a75e-11e7-92f9-f511ef5b902d.jpg)
* 以下のような画面が表示されたら、完了です。
![inst03](https://user-images.githubusercontent.com/5683857/31061754-68799138-a75f-11e7-9f42-577e7c3c57ce.jpg)

## 02. GitHubプロジェクトのclone

以下のプロジェクトをローカルへcloneして下さい。

このプロジェクトには、以下のものが含まれます。

* sample01
  * サンプル・アプリケーション
* import
  * ハンズオンで使用するCSVファイルを格納
* doc
  * 当日のスライド(PDFファイル)を含む
    * ハンズオンではクエリを記述・発行しながら進めます。
      その際、クエリをタイプする代わりにPDFファイルの内容をコピーして下さい。


## 03. サンプルアプリケーションのインポート

プロジェクト直下の「sample01」をMavenプロジェクトとして、開発環境へインストールして下さい。

### Eclipse

### IntelliJ
