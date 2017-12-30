package io.github.biezhi.plugins.model

/**
 * Emoji mapping
 *
 * @author biezhi
 * @date 2017/12/30
 */

class EmojiMapping {

    var action: String = ""
    var lang: Lang = Lang.us_EN
    var emoji: EmojiData?

    constructor(lang: Lang, emoji: EmojiData) {
        this.lang = lang
        this.emoji = emoji
        if (lang == Lang.us_EN) {
            buildEnAction(emoji.emojiText)
        } else if (lang == Lang.zh_CN) {
            buildCnAction(emoji.emojiText)
        }
    }

    private fun buildEnAction(emoji: String) {
        action = when (emoji) {
            "art" -> "Improving structure / format of the code."
            "zap" -> "Improving performance."
            "fire" -> "Removing code or files."
            "bug" -> "fixing a bug."
            "ambulance" -> "Critical hotfix."
            "sparkles" -> "Introducing new features."
            "memo" -> "Writing docs."
            "rocket" -> "Deploying stuff."
            "lipstick" -> "Updating the UI and style files."
            "tada" -> "Initial commit."
            "white_check_mark" -> "Adding tests."
            "lock" -> "Fixing security issues."
            "apple" -> "Fixing something on macOS."
            "penguin" -> "Fixing something on Linux."
            "checkered_flag" -> "Fixing something on Windows."
            "robot" -> "Fixing something on Android."
            "green_apple" -> "Fixing something on iOS."
            "bookmark" -> "Releasing / Version tags."
            "rotating_light" -> "Removing linter warnings."
            "construction" -> "Work in progress."
            "green_heart" -> "Fixing CI Build."
            "arrow_down" -> "Downgrading dependencies."
            "arrow_up" -> "Upgrading dependencies."
            "pushpin" -> "Pinning dependencies to specific versions."
            "construction_worker" -> "Adding CI build system."
            "chart_with_upwards_trend" -> "Adding analytics or tracking code."
            "recycle" -> "Refactoring code."
            "heavy_minus_sign" -> "Removing a dependency."
            "whale" -> "Work about Docker."
            "heavy_plus_sign" -> "Adding a dependency."
            "wrench" -> "Changing configuration files."
            "globe_with_meridians" -> "Internationalization and localization."
            "pencil2" -> "Fixing typos."
            "hankey" -> "Writing bad code that needs to be improved."
            "rewind" -> "Reverting changes."
            "twisted_rightwards_arrows" -> "Merging branches."
            "package" -> "Updating compiled files or packages."
            "alien" -> "Updating code due to external API changes."
            "truck" -> "Moving or renaming files."
            "page_facing_up" -> "Adding or updating license."
            "boom" -> "Introducing breaking changes."
            "bento" -> "Adding or updating assets."
            "ok_hand" -> "Updating code due to code review changes."
            "wheelchair" -> "Improving accessibility."
            "bulb" -> "Documenting source code."
            "beers" -> "Writing code drunkenly."
            "speech_balloon" -> "Updating text and literals."
            "card_file_box" -> "Performing database related changes."
            "loud_sound" -> "Adding logs."
            "mute" -> "Removing logs."
            "busts_in_silhouette" -> "Add contributor(s)."
            "children_crossing" -> "Improving user experience / usability."
            "building_construction" -> "Making architectural changes."
            else -> ""
        }
    }

    private fun buildCnAction(emoji: String) {
        action = when (emoji) {
            "art" -> "改进代码的结构/格式"
            "zap" -> "提升性能"
            "fire" -> "删除代码或文件"
            "bug" -> "修复了一个 BUG"
            "ambulance" -> "关键代码修复"
            "sparkles" -> "添加新特性"
            "memo" -> "编写文档"
            "rocket" -> "部署程序"
            "lipstick" -> "更新界面和样式文件"
            "tada" -> "初始化提交"
            "white_check_mark" -> "添加测试代码"
            "lock" -> "修复安全问题"
            "apple" -> "修复 MacOS 平台问题"
            "penguin" -> "修复 Linux 平台问题"
            "checkered_flag" -> "修复 Windows 平台问题"
            "robot" -> "修复 Android 平台问题"
            "green_apple" -> "修复 IOS 平台问题"
            "bookmark" -> "发布一个版本"
            "rotating_light" -> "移除警告信息"
            "construction" -> "正在进行中"
            "green_heart" -> "修复 CI 构建"
            "arrow_down" -> "依赖降级"
            "arrow_up" -> "依赖升级"
            "pushpin" -> "指定特定版本依赖"
            "construction_worker" -> "添加 CI 构建到系统"
            "chart_with_upwards_trend" -> "添加分析或跟踪代码"
            "recycle" -> "重构代码"
            "heavy_minus_sign" -> "移除依赖"
            "whale" -> "Docker 相关工作"
            "heavy_plus_sign" -> "添加依赖"
            "wrench" -> "修改配置文件"
            "globe_with_meridians" -> "国际化和本地化"
            "pencil2" -> "修复拼写错误"
            "hankey" -> "改进垃圾代码"
            "rewind" -> "恢复修改"
            "twisted_rightwards_arrows" -> "合并分支"
            "package" -> "更新已编译的文件或包"
            "alien" -> "由于外部API的改变而更新代码"
            "truck" -> "移动或重命名文件"
            "page_facing_up" -> "添加或更新许可"
            "boom" -> "引入重大变化"
            "bento" -> "添加或更新资源"
            "ok_hand" -> "更新代码，因为代码审核变更"
            "wheelchair" -> "提高可访问性"
            "bulb" -> "添加源码注释"
            "beers" -> "醉酒鞋写代码"
            "speech_balloon" -> "更新文本和字面量"
            "card_file_box" -> "执行数据库相关的变化"
            "loud_sound" -> "添加日志记录"
            "busts_in_silhouette" -> "添加贡献者"
            "children_crossing" -> "提高用户体验/可用性"
            "building_construction" -> "架构调整"
            else -> ""
        }
    }

}
