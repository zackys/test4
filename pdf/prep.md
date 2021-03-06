# 案１）グラフデータベース=Neo4j超入門
# 案２）つながる！見つかる！グラフDB超入門

## イベントの概要

グラフデータベースをご存じでしょうか。<br>
リアルタイム・レコメンデーション・エンジンやマネーロンダリングの検出など、RDBMSでは複雑な検索になりがちなドメインの問題解決に威力を発揮するNoSQLの一種です。
そんなグラフデータベースを、パナマ文書の解析でも使用された[Neo4j](https://neo4j.com/)というプロダクトを使用し、データ操作の基礎から簡単なJavaアプリケーションの作成までをハンズオン形式でご紹介します。

## 想定参加者

* グラフデータベースに興味があるが、まだ手を出せていない方
* 事前準備(後述)を勉強会当日までに実施し、事前準備したノートPCを当日持参できる方
* (Javaの知識)

## 事前準備（30分～1時間程度）

今回は各自PCをお持ち込みいただき、そのPC上でハンズオンをしていただくことを想定しております。当日のハンズオンをスムーズに進めるため、事前に以下の準備をお願いします。

* Neo4jのインストールと簡単な動作確認
* サンプルアプリケーションの開発環境へのインポート
  * GitHub上に公開予定のJavaサンプルアプリケーションをノートPCの開発環境へインポートして下さい。
  * サンプルアプリケーションはMavenプロジェクトとして公開予定です。

こちらの手順に従って準備をお願いします。

[事前準備](https://github.com/zackys/handson-neo4j/blob/master/doc/00_prep.md)

## 講演内容（アジェンダ・予定）

* はじめに
* データ要素 of Neo4j
* データ操作 of Neo4j
* ソーシャル・グラフの検索
* Javaアプリケーションによる操作
