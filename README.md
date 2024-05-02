# ToDoApp

- TODOリスト登録アプリ

## 使用技術
![](https://img.shields.io/badge/jetpack_compose-FF6441)
![](https://img.shields.io/badge/viewmodel-FF6441)
![](https://img.shields.io/badge/coroutine-FF6441)
![](https://img.shields.io/badge/flow-FF6441)

![](https://img.shields.io/badge/room-v2.6.1-blue)
![](https://img.shields.io/badge/hilt-v2.48-blue)


## 画面仕様

**画面表示時**

 データなし                      | データあり                      
----------------------------|----------------------------
 ![](readmefiles/データなし.png) | ![](readmefiles/データあり.png) 
 「+」ボタンタップでダイアログを表示する | アイテムタップでダイアログを更新状態で表示する<br/>削除ボタンタップでアイテムを削除する

---

**ダイアログ**

 表示時                        | 入力時                           
----------------------------|-------------------------------
 ![](readmefiles/ダイアログ.png) | ![](readmefiles/ダイアログ_入力.png) 
 キャンセルボタンタップでダイアログを閉じる<br/>登録ボタンタップでタスクを登録する | タスクタイトルと詳細を入力する

---

**更新時**

- 登録済みのリストアイテムタップされた場合は編集可能
- ダイアログに登録したタイトルと詳細を表示する

更新時

<img width="30%" src="readmefiles/更新.png">
