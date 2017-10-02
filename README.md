# test4

# 0. 事前準備

## Neo4jのインストールと動作確認

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
* パスワードの変更を求められるので、任意のパスワードに変更する
  * この時の「ユーザー」と「パスワード」はハンズオンで使用するので、覚えておく
* 以下のような画面が表示されたら、完了です。



