/*
Navicat MySQL Data Transfer

Source Server         : mylocal
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : bookcard

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2020-10-25 21:23:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `articleId` int(11) NOT NULL AUTO_INCREMENT,
  `articleCategoryId` int(11) NOT NULL,
  `articleCategoryName` varchar(20) NOT NULL,
  `articleName` varchar(20) NOT NULL,
  `articleSponsorName` varchar(255) NOT NULL,
  `articleSponsorEmail` varchar(20) NOT NULL,
  `articleContent` text NOT NULL,
  `articleCreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `articleUpdateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`articleId`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('71', '2', '户外装备', '什么叫冲锋衣', 'huang', '346484458@qq.com', '冲锋衣这个词在汉语中的来源， 不知道是大陆自己搞的翻译还是从港台或者华语圈内其他国家引入的。\n\' W# G; }8 L& e2 y! A\n个人认为这个翻译并不算好，因为单纯从字面上来讲，冲锋衣就是登山冲顶时所穿的外套，所以哪怕是最经典的皮袍子也可以叫冲锋衣；而现在被户外店叫做冲锋衣的东西，实际上包含了waterproof/breathable parka/jacket和Water-resistant/wind-resistant parka/jacket这两类价格相差很大的户外服装，甚至还包括一部分raincoat，这就造成了一定程度上的混乱。\n\n大家一般提到冲锋衣时所指的东西，在主要的生产商产品目录上大多被称为parka，也有少量的jacket。 按韦伯斯特词典的解释，parka这个词来自俄语，本意是一种俄国北极地区的带风帽的皮质套头衫。 后来引申为一切带有风帽并且可加装衬里的套头衫或夹克的统称。\n7 P7 \\2 P8 S8 _5 {- X: q\n! ?6 \\( e4 v! O- s; d  Z3 Q! Y\n式样上，现代的parka一般做成短风衣的款式，风帽上有滑扣之类的附件可以调节风帽形状和头型吻合；领口处通常有加厚或是一层薄的抓绒衬里以减少这里的热量损失；肩肘部有增强耐磨性的加厚；内包开口在拉练以外以减少热量损失，衣袋开口较高或有胸袋，避免被背包腰带压住衣袋取不出东西的情况发生；衣服的后片比前片略长，袖管略向前弯，以补偿运动；通常会有腋下拉链（但是也有例外，比如TNF臭名昭著的Core Vent系统），有的会有雪裙。jacket的样式相对比较生活化，一般没有风帽。\n6 ?- c; i6 j5 A3 F) @6 k4 b+ e/ l\n根据材料，parka和jacket又可以分成windproof/breathable，windproof/non-breathable和wind-resistant/water-resistant三种，windproof/breathable的代表当然是著名的GTX。windproof/non-breathable也许有时会做得很fancy，但实际上就是塑料雨衣。至于wind-resistant/water-resistant的衣料，即使在小雨里淋久了也会漏水，在户外活动中并不是很实用，城市旅游中或许可以考虑。时装专卖店里卖的风雨衣多半是这类货色。后面两类除了在衣料上有区别，设计上也常常会简化掉一些东西，比如腋下拉链，雪裙，袖筒形状，风帽滑扣等等，从而看起来更生活化，不是那么奇怪。\n\n至于raincoat，并不是我们印象中的自行车雨披或者一次性塑料雨衣裤。而是对相对parka而言比较轻巧的防水衣物的总称——有时也被归类为Ultralight rainwear。这类衣物为了减轻重量，通常取消了内衬，防水透气材料直接附着在面料内表面，parka上的加厚和其他小东西也被取消了，当然，也不能加挂抓绒内衬。raincoat牺牲了一定的强度换来的是更轻的重量——可以比同样大小的parka轻上1/3和更小的压缩体积——压缩后不到parka的一半。7 ]; J, A  V% t9 L3 V- U& g; k\n\n价格上当然是waterproof/breathable parka最贵，一般会在$200-500，water-resistant/wind-resistant的就要便宜很多，多在几十美元到$200之间。raincoat里面waterproof/breathable的也在这个价格段内。waterproof/non-breathable的最便宜——塑料雨衣再豪华，仍然只是塑料雨衣——几美元到几十美元就可以搞定（不过这东西的强度如何值得怀疑：我就在一个周末的两天里亲眼看到某人新买的塑料雨衣怎么从衣服一步一步变成麻袋片的）。因为国内大多数户外店并不会明确区分这几类服装而只是把它们统称为冲锋衣，这就需要你在购买的时候自己留心，多问多看。\n! H5 S5 o2 b; Z- p& f% D: T\n从上面提到的parka结构特征可以看出，这类衣服设计的时候优先考虑的是寒冷环境中的保暖，所以在不是那么寒冷的环境下，你绝不能预期它有很高的表现——即便是GTX-XCR的衣服，在北京周边这样的气候下，春夏秋三季穿上它再背上几十斤重的大包上串下跳半个小时，衣服里面也会积上一滩汗水排不出去。因为我主要在春夏秋三季外出活动，并且比较看重重量和透气性，所以我偏爱raincoat；当然对于那些活动强度更大，偏重考虑衣服的强度和可靠性的驴友，waterproof/breathable parka会是更合适的选择。如果只是在城市里旅游，一个小时内肯定能找到地方避雨，一件便宜的water-resistant/wind-resistant jacket足矣，没有必要花更多的钱去追求永远用不到的那些功能。归根到底，还是那个老问题：我到底需要什么？弄明白了自己的需要，就会少花些冤枉钱了', '2018-03-10 02:06:33', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('72', '6', '线路攻略', '惠东海滩出游攻略', 'huang', '346484458@qq.com', ' 惠州巽寮湾我前几年6月去过，感觉那里的海还不错，这次加了半天的双月湾。事先抓紧时间做了一点功课，行程安排还算挺开心的。\n        这是个不大的地方，网上能查到的攻略有，但是不算详细。我尽量把这次搜集到的信息在这里说完，希望能给大家一个参考。\n我们早上8点半从顺德出发，没有走虎门，在广州大概3个多小时就到双月湾所在的平海镇了。双月湾离巽寮湾20多公里，途中会经过进入巽寮湾的路口。我们这次把双月湾放在前面，事实证明还是比较正确的，因为巽寮湾周边配套比较完善，住的比较傲舒服。但是双月湾周边也在建设中，估计明年的话就也不错了。\n       12点半左右到的平海，决定先在镇上吃饭。找了家本地人比较多的饭店，点了一斤椒盐濑尿虾，一条什么鱼，一盘炒生菜，结账98好像。其实倒是不算贵的，但是濑尿虾做得不好吃，非常湿。如果能再熬个十几二十分钟，到了双月湾那边的市场，就可以直接买海鲜，然后加工，肯定吃的更好。后面会介绍。吃完饭后全速向双月湾出发，到了这里你就基本不用导航都可以找到双月湾，因为万科在那边建一楼盘，到处都是“万科-双月湾”的指示牌，跟着走就是。\n      双月湾的海滩很平，所以沙滩很宽，而且沙又白又细。淡季，而且是中午，整片海滩都是我们的。\n下了桥，把车停在路边，往右走，是一个市场，向我们一般的市场，很多卖菜卖水果的。市场旁边的路上还有很多海鲜店或者加工店。我们在海味店买了虾米，鱿鱼丝和一些鱼干。我不知道贵不贵，但是品质是不错。我喜欢吃鱿鱼丝，这里30一斤的，绝对没有粉的感觉，每根都是实打实的犹豫。而且绝对足称，一斤一大包！\n这里是个小镇，就是双月湾的另一边，理论上，你走到小镇的另外一边，应该也是沙滩。那就真正能领略双月湾的神奇了。但是我们记者要去酒店，因为想着晚上的海鲜大餐，还有我们的无敌海景房。\n这次订的是凤池岛酒店的行政海景房，网上订的，400一晚。我们住的15楼，因为是淡季，原价好像是2580。我们是前天晚上才订的，要是能早两个星期，只要250啊，绝对超值。电磁炉，油烟机，冰箱什么的都有，要是带个锅，你就可以自己煮海鲜了。我们最心水的是阳台啊！270度海景啊！楼下是游泳池，和私人沙滩，这片沙滩还是不错的。路程很近，而且也算是大路，来的时候的那条主路的一旁进去就是。出了酒店大门右拐，然后看到差不多有很多民居，找个路口右拐就是。记得市场也算是靠海的。我们就在角落这家买了一斤濑尿虾（18）一斤海虾（45吧）两斤花蛤（20）8个生蚝（16）加起来是99不？反正买了99的。没有砍价，后来加工的老板说我们应该砍下价，不过也没有买贵多少。问了海鲜档的老板在哪可以加工，给我们指指对面，说10块15块一个。于是我们就提着几袋原料过去了。老板直接把我领进厨房，让我告诉他怎么做。厨房很干净，我当时就想，敢把客人领进厨房的，应该是心里坦荡荡的吧。于是多了一份安心。事实证明，确实不错啊！\n     第二天中午还是在这吃，跟老板聊了很久。他说，巽寮湾的海鲜加工是他做起来的，旺季请几十个员工都忙不过来，而且他用的油是花生油。反正是各种自豪。打下广告下！外面有很多海鲜饭店的，不过应该比较贵，跟我们中午那顿一样。一定要有耐性找找盛安啊。而且后来我们遇到一对参团的小情侣，告诉我们别家加工要20一个。\n隆重推荐！椒盐濑尿虾！中午那盘濑尿虾又咸又湿，我还特地问了周老板他们炒得是干身还是湿的，人家一脸惊讶：椒盐濑尿虾当然是干的啦！味道刚刚好，有椒盐的香味，而且壳炒的脆脆的！真是一流，老公最爱濑尿虾，这次满足了！再次给个赞啊！！！\n第二天早上，在酒店餐厅吃了自助早餐，不能说很美味，但是也算不错了，中西餐该有的都有。\n我上次来是跟团，有出海打渔，惦记着记忆中远处海上那片碧蓝，很想跟老公分享，正好这几位在跟团的叔叔阿姨在砍价，于是以15块没人的价钱，上了船。\n总结下这次的费用：1600左右\n        路费：油费+路费600-\n        住：凤池岛行政海景房一晚（双早）400\n        吃：98+154+115=367（不推荐吃鱼，我的经验一般加工的鱼都蒸过火，而且大部分海鲜市场买到的海鱼本身肉质不够嫩）\n       其他：饮料等50-\n       海味干货：200+\n       建议\n       1、一群朋友一起去，吃住行都可以分摊，而且这地方也能热闹。\n       2、巽寮湾有什么好吃的呢？找吃的不难，有点耐性，再不行可以问下人，尤其是双月湾，一过桥明显就能判断市场在那，这样可以生不少。\n       3、如果你特别喜欢吃土豆，在平海你可以批几百斤回去。那里是什么国家农业什么基地，路两边一片一片的土豆。我们经过的时候就有农民叔叔在收土豆，一箱一箱地放在路边。还有些草莓园和火龙果园，这时候没看到火龙果有结果，有兴趣的也可以安排下摘草莓或者火龙果的行程，就在路边。\n        4、6月开始就进入旺季了，虽然因为天气关系，那时候的海非常美，但是人也多，7、8月又晒人又多，酒店也贵。连去盛安都没位置吃啊！建议4、5月赶紧去。\n        5、如果你想感受下在海滩开车，可能今年要抓紧时间去了。我们去的时候双月湾不收费，但是周边的酒店很多在建，而且海滩好像开始要围起来了。不知道以后能不能开车进去，或者会不会变成收费项目。就算是巽寮湾，现在的样子和我三年前去已经是完全不一样了。不过个人认为还不算过度开发，以后就不知道了。', '2018-03-10 02:08:01', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('73', '3', '行摄笔记', '景宁旅游游云中大漈', 'huang', '346484458@qq.com', '这是我们计划了很久的一次旅行，大学期间就一直在和朋友在讨论旅游的地点，筛选了很多地方最终是选在了被喻为“云中桃源”的云中大漈。之所以选在这里是因为有：建于南宋时期的全国重点文物保护单位——时思寺；树龄达1500多年的亚洲之最——柳杉王“浙江绿谷十佳景点”之一的雪花漈，还有许多历史古迹和自然景观。最主要还是16年的学习，终于可以好好尽情的放松自己。\n\n刚毕业，拿着不多的在校实习工资就立马和朋友出发前往我们的目的地：云中大漈。\n\n云中大漈是在过景宁县城后在前行50多公里才能到达，所以我们就坐高铁到景宁县城休息了一晚，第二天早晨出发。路途有1个多小时的盘山公路，多弯坡陡，而习惯了城市里的高楼大厦，现在突然被群山包围，又有种不习惯呢。不同于城市内汽车尾气，各种奇怪的味道，在这群山之中有的只有草树，泥土的清香。\n\n这便是云中大漈著名景点之一时思寺。时思寺是一座佛教与道教合一的祀庙。原来是宋绍兴年间的梅元屃守墓庐，元至正十六年（1356年）创为时思道场，明宣德间又改为寺。由山门、钟楼、大殿、三清殿、马仙宫、梅氏宗祠等建筑组成，是一组兼有元、明、清各时代特征的古建筑群。时思寺的悠久的历史传承可是对研究当地历史有着极高的价值。\n\n刚进山门就能看见两颗古柏，一颗在悠长的岁月中已向侧生长，另一颗却不像这么夸张。在时思寺中行走仿佛回到古代一般，土泥墙，木制房，不同的是木屋泥墙不在是最初的样子，经历了风霜，爬上了草。想着要是以后能住在这种幽静的地方也是不错的。\n\n\n这个就是心经钟楼，也是古迹中保存最完美的古建筑，其形制非常古老，共三层。\n\n房屋建筑也经过长年累月的风雨洗礼，透露出一股沧桑感，平时行走在钢筋混凝土的高楼大厦之间，与之相比，在这些土木屋游玩却没有什么不舒服的感觉，反而更觉得自己贴近大自然。让我想起了小时候外婆的家，晚上睡觉，虽然在屋内但还是能闻到无比清新的空气，更好的入睡。\n\n在时思寺的旁边有名为护关桥的廊桥，分三层楼，有魁星楼与文昌阁。桥中第一层是关帝庙，正中供奉红脸关羽，左右是财神爷。第二层是文昌阁，供奉的是文昌帝君，第三层单独供奉魁星爷。这也能在旁边的通道过桥往往里面的神灵，门是锁着的不能进入。我想是怕一些游客损坏里面的东西，，毕竟也是很久的廊桥了。\n\n此外还有胡桥，胡桥在护关桥上游三百米左右的地方，桥头各摆着长椅，可以方便游客行人，累了可以做下休息片刻。桥内也方便雨天行人门躲雨，从远处看过来更像一座建在小河上方的小房屋供人居住，但走近一看才发现原来是一座桥。\n\n龙溪桥，在1948年由全体村民集体建造而成的，也是廊桥结构。\n\n\n这便是柳杉王了，它位于时思寺的门前东侧斜坡上，现在这副样子是它的主干被雷击截断，削去大半截，现在只剩28米，虽然如此但看上去任然苍老雄劲。而“柳杉王”这个名字的由来则是2001年秋，时任浙江省林业局长程渭山经过多方比较,认为柳杉王是世界上最大、最古老树，并为之题名\"柳杉王\"。柳杉王的根部有一个形似门户的洞，只可以一个人进出，由于受到雷击，被截取一大截，在树洞中抬头就能看见天上的云彩，而树洞内的空间也是很大，十几人人在内围坐吃饭绰绰有余。\n\n接着来到最富盛名的雪花漈，被评为浙江绿谷十佳景点之一。民国教育厅长许绍棣慕名而往，触景启兴，于其右侧石壁上书勒:\"雪花漈\"三大字。在来这之前我们算是做足了功课，本来不了解雪花漈为什么叫雪花漈，“漈”又是什么意思。方言里“漈”就是瀑布的意思。算是小小的长了一点知识。\n抬头远望，水流从百米高的悬崖飞泻而下，气势汹汹，声震幽谷。走进观看，你会发现不同于青田千丝瀑布的水流飞泻而下形成的万缕千丝，雪花漈的水流更像雪花一般飞落下来，我想雪花漈的名字也是因此而来的把。只有来到雪花漈你才能感受到那百丈悬崖飞泻而下的水流形成的瀑布的雄伟及壮美。\n\n难以想象那百丈瀑布的源头尽是一条小河流。想想也是水流经过重重岩石的阻碍，冲出那百丈高的悬崖，带着一往无前的气势，撞击峭壁，像似雪花，才能形成雪花漈如此有名的自然风景。\n\n聆听着水流击石发出的轰鸣声，心思也不知不觉的飘向远方。\n\n老村古树，古寺廊桥，雪花瀑布，群山环绕，云中大漈不愧是我国4A级的景区。来到这里可以体验乡村风情，远离了城市的喧闹，这里更能让人静下心来感悟人生。', '2018-03-10 02:11:05', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('74', '4', '驴友问答', '青海湖，敦煌6日游', 'huang', '346484458@qq.com', '8月30号我们从江西飞到西宁，8月31号-9月5号包车去青海，敦煌，祁连山草原6日游大环线，美丽的青海湖，蓝蓝的天和湖水连成一片，茶卡盐湖的盐雕，神奇的雅丹魔鬼城披着神秘的面纱，千年莫高窟的壁画和佛像带给我们的震撼，传说中的月牙泉，在鸣沙山的沙漠骑着骆驼，神奇的大自然中美丽的七彩丹霞，美丽的祁连大草原和绵绵不断的雪山，回来的路上遇见了从来就没有看见过的双彩虹，这一路走来，我们行走在天路，戈壁滩，荒漠的大地之间，各种美景尽收眼中，不虚此行，包车的杨师傅，马师傅人蛮好的，感谢他们一路上的暖心护航，以后如果有到青海这边旅游的需要包车的可以找这位杨师傅，人不错，不乱坑人，实实在在的生意人，2位师傅的电话各是13709765716杨师傅，18697182855马师傅！', '2018-03-10 02:14:30', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('79', '1', '测试', 'HJJ', 'Hjj', '19689405@qq.com', '65111111', '2018-03-10 10:17:16', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('80', '2', '户外装备', '我们一起', 'aaron', '542618305@qq.com', '我们一起去旅游', '2018-03-10 10:20:25', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('83', '3', '行摄笔记', '厦门行', 'aaron', '542618305@qq.com', '厦门鼓浪屿，你喜欢吗？', '2018-03-10 11:08:21', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('85', '1', '测试', 'HJJ', 'Hjj', '19689405@qq.com', '65111111', '2018-03-10 11:27:10', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('86', '1', '测试', 'HJJ', 'Hjj', '19689405@qq.com', '65111111', '2018-03-10 11:45:29', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('87', '0', 'GHH', 'asda', 'HJJ', '19689405@qq.com', 'sadsadas', '2018-03-10 11:47:25', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('91', '2', '户外装备', '登山鞋', 'hjj', '346484458@qq.com', 'test', '2018-03-21 11:18:11', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('93', '5', '活动约伴', '2月13号相约广州', 'hjj', '346484458@qq.com', 'test', '2018-03-21 11:29:39', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('94', '5', '活动约伴', '3月15号相约从化', 'hjj', '346484458@qq.com', 'test', '2018-03-21 11:30:14', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('95', '5', '活动约伴', '11月相约华软', 'hjj', '346484458@qq.com', '广州大学华软软件学院有“丝木棉节” ！华软学院“丝木棉节”定在每年11月中旬至12月，恰逢华软丝木棉绽放的季节，每年这个时节，华软就成为花的海洋。“丝木棉节”还将举办一系列丰富多彩的校园文化活动。\n11月相约华软参加“丝木棉节”，一同欣赏丝木棉，人数越多越好，共游华软，参观白宫、无边湖。', '2018-03-21 11:59:25', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('96', '4', '驴友问答', '提问华软游的相关事宜', 'hjj', '346484458@qq.com', 'test', '2018-03-21 12:23:52', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('97', '6', '线路攻略', '出游华软丝木棉节攻略', 'hjj', '346484458@qq.com', 'test', '2018-03-21 12:25:52', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('98', '1', '测试', 'HJJ', 'Hjj', '19689405@qq.com', '65111111', '2018-03-31 16:57:55', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('99', '1', '测试', 'HJJ', 'Hjj', '19689405@qq.com', '65111111', '2018-03-31 17:01:07', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('100', '0', 'GHH', 'asda', 'HJJ', '19689405@qq.com', 'sadsadas', '2018-03-31 17:06:08', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('101', '1', '测试', 'HJJ', 'Hjj', '19689405@qq.com', '65111111', '2018-05-04 22:59:26', '2020-06-21 17:05:31');
INSERT INTO `article` VALUES ('102', '1', '测试', 'HJJ', 'Hjj', '19689405@qq.com', '65111111', '2018-05-05 10:53:34', '2020-06-21 17:05:31');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `categoryId` int(11) NOT NULL AUTO_INCREMENT,
  `categoryName` varchar(20) NOT NULL,
  `categoryIntroduce` varchar(300) NOT NULL,
  `categoryUpdateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`categoryId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('2', '户外装备', '普及装备知识，交流装备购买、使用和维护保养心得体会，让户外活动更安全、更舒适、更轻松、更快乐！\r\n\r\n未经允许谢绝任何形式的商业帖，违者一律直接删帖！本版禁止以各种形式推销装备，违者一律直接删帖；不听劝告多次发布违规帖子的，给予禁言处罚！', '2020-06-21 17:21:38');
INSERT INTO `category` VALUES ('3', '行摄笔记', '请根据活动地点进行发帖分类，国内地区行政区划如下：【东北】辽宁、吉林、黑龙江；【华北】北京、天津、河北、山西、内蒙古；【西北】陕西、甘肃、青海、宁夏、新疆；【华中】河南、湖北、湖南；【华东】上海、江苏、浙江、安徽、福建、江西、山东；【华南】广东、广西、海南；【西南】重庆、四川、贵州、云南、西藏\r\n\r\n未经允许谢绝任何形式的商业帖，包括软文广告帖，违者一律直接删帖！', '2020-06-21 17:21:38');
INSERT INTO `category` VALUES ('4', '驴友问答', '户外运动、户外旅行知识交流学习专版。禁止各种无实质意义的灌水帖。\r\n\r\n未经允许谢绝任何形式的商业帖，违者一律直接删帖！', '2020-06-21 17:21:38');
INSERT INTO `category` VALUES ('5', '活动约伴', '本版为AA性质户外活动召集、约伴、拼途、捡人、求被捡专版，仅限于发布包括召集者在内AA均摊费用、各自承担出行风险的活动召集、约伴或者拼途的帖子。无目的地、无出发时间、无任何行程计划的帖子，将被视为水帖而删除。凡参加活动后发现为假AA者，请及时向我们举报，查证属实立即删除召集者帐号！严禁户外俱乐部以任何名义在AA版发召集帖！严禁商家在AA版发帖拉生意，发现立即删除帐号！\r\n\r\n本版仅作为户外活动信息发布交流平台，不负责验证活动的真实性，也不对活动出现的纠纷负责，请驴友自行辨别。', '2020-06-21 17:21:38');
INSERT INTO `category` VALUES ('6', '线路攻略', '欢迎大家以某个地区、城市或者景区为限，提供自助旅行攻略。请以驴友的角度，从吃、住、行、游、购、娱等各方面提供尽可能全面的真实准确的攻略资料。推荐标题格式范例：丽江自助旅行攻略/厦门自助旅行攻略（2013版）/北京自助游攻略...所有发布的主题帖，一律经版主审核后才能显示出来，不合格的直接删除。本版原有的帖子按照新标准清理；谢绝各类商业广告帖、软文广告帖。', '2020-06-21 17:21:38');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `commentId` int(11) NOT NULL AUTO_INCREMENT,
  `commentArticleId` int(11) NOT NULL,
  `commentContent` varchar(100) NOT NULL,
  `commentByName` varchar(10) NOT NULL,
  `commentByEmail` varchar(20) NOT NULL,
  `commentCreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `commentUpdateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`commentId`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('47', '1', 'text', 'hjj', '12345678@qq.com', '2018-03-10 03:22:57', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('48', '76', 'test', 'huang', '346484458@qq.com', '2018-03-10 06:20:37', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('49', '71', 'test', 'huangjj', '346484458@qq.com', '2018-03-10 07:06:36', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('50', '78', 'test', 'huangjj', '346484458@qq.com', '2018-03-10 08:50:21', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('51', '81', 'test', 'huang0544', '346484458@qq.com', '2018-03-10 10:31:18', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('53', '80', '有趣', 'aaron', '542618305@qq.com', '2018-03-10 10:47:37', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('54', '71', '有趣', 'aaron', '542618305@qq.com', '2018-03-10 11:07:40', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('55', '83', '有趣', 'aaron', '542618305@qq.com', '2018-03-10 11:08:58', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('56', '84', 'test', 'huang0544', '346484458@qq.com', '2018-03-10 11:24:59', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('57', '1', '222', '111', '111651@qq.com', '2018-03-10 11:46:33', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('58', '1', '15465465', 'HJJ', '19689405@qq.com', '2018-03-10 11:47:47', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('60', '95', '需要参加的可以在户外活动分类的活动中报名', 'hjj', '346484458@qq.com', '2018-03-21 12:04:44', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('61', '95', '具体活动时间11月开始', 'hjj', '346484458@qq.com', '2018-03-21 12:05:42', '2020-06-21 17:25:04');
INSERT INTO `comment` VALUES ('62', '71', 'test', 'hjj', '3464848@qq.com', '2018-05-05 14:47:58', '2020-06-21 17:25:04');

-- ----------------------------
-- Table structure for dating
-- ----------------------------
DROP TABLE IF EXISTS `dating`;
CREATE TABLE `dating` (
  `datingId` int(11) NOT NULL AUTO_INCREMENT,
  `datingSponsorName` varchar(20) NOT NULL,
  `datingSponsorEmail` varchar(20) NOT NULL,
  `datingName` varchar(20) NOT NULL,
  `datingContent` text NOT NULL,
  `datingStartTime` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `datingOverTime` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `datingSumpeople` int(11) NOT NULL,
  `datingCreatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `datingUpdatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`datingId`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dating
-- ----------------------------
INSERT INTO `dating` VALUES ('55', 'hjj', '346484458@qq.com', '青海湖，敦煌6日游', '8月30号我们从江西飞到西宁，8月31号-9月5号包车去青海，敦煌，祁连山草原6日游大环线，美丽的青海湖，蓝蓝的天和湖水连成一片，茶卡盐湖的盐雕，神奇的雅丹魔鬼城披着神秘的面纱，千年莫高窟的壁画和佛像带给我们的震撼，传说中的月牙泉，在鸣沙山的沙漠骑着骆驼，神奇的大自然中美丽的七彩丹霞，美丽的祁连大草原和绵绵不断的雪山，回来的路上遇见了从来就没有看见过的双彩虹，这一路走来，我们行走在天路，戈壁滩，荒漠的大地之间，各种美景尽收眼中，不虚此行，包车的杨师傅，马师傅人蛮好的，感谢他们一路上的暖心护航，以后如果有到青海这边旅游的需要包车的可以找这位杨师傅，人不错，不乱坑人，实实在在的生意人，2位师傅的电话各是13709765716杨师傅，18697182855马师傅！', '2018-03-10 14:54:37', '2018-03-10 14:54:37', '0', '2018-03-10 02:54:15', '2020-06-22 22:23:07');
INSERT INTO `dating` VALUES ('56', 'hjj', '346484458@qq.com', '（活动已完成，该活动为无效活动）', '春节出行台湾，两个人组团，从初四到初六，有意者请报名，电话：13398245758', '2018-03-10 14:54:37', '2018-03-10 14:54:37', '0', '2018-03-10 02:56:21', '2020-06-22 22:23:07');
INSERT INTO `dating` VALUES ('57', 'hjj', '346484458@qq.com', '成都往返去色达', '11号早上8点从成都出发，川西7天环线。去成都狂吃狂吃，去四人同看云暴（运气好的话），海螺沟泡泡温泉，去色达看看红房子，去米亚罗看看枫叶林。有意向的小伙伴加我微信：17628077356\n', '2018-03-10 14:54:37', '2018-03-10 14:54:37', '0', '2018-03-10 03:18:04', '2020-06-22 22:23:07');
INSERT INTO `dating` VALUES ('58', 'hjj', '346484458@qq.com', '清明节相约华软', '地点华软，人数越多越好', '2018-03-10 14:54:37', '2018-03-10 14:54:37', '0', '2018-03-10 07:21:38', '2020-06-22 22:23:07');
INSERT INTO `dating` VALUES ('59', 'hjj', '346484458@qq.com', '三八妇女节结伴爬山', '地点在从化大山，人数十人左右', '2018-03-10 14:54:37', '2018-03-10 14:54:37', '0', '2018-03-10 07:24:58', '2020-06-22 22:23:07');
INSERT INTO `dating` VALUES ('61', 'hjj', '346484458@qq.com', 'test', 'ab', '2018-03-10 14:54:37', '2018-03-10 14:54:37', '0', '2018-03-10 10:30:18', '2020-06-22 22:23:07');
INSERT INTO `dating` VALUES ('62', 'hjj', 'hjj@qq.com', 'jjj', '随便啦', '2018-03-10 11:46:45', '2018-03-10 11:46:45', '5', '2018-03-10 11:46:45', '2020-06-22 22:23:07');
INSERT INTO `dating` VALUES ('64', 'hjj', '346484458@qq.com', 'test', 'test', '2018-03-01 00:00:00', '2018-03-01 00:00:00', '0', '2018-03-10 12:19:31', '2020-06-22 22:23:07');
INSERT INTO `dating` VALUES ('65', 'hjj', '346484458@qq.com', '相约1987', 'test', '2018-03-10 14:54:37', '2018-03-10 14:54:37', '0', '2018-03-10 14:23:53', '2020-06-22 22:23:07');
INSERT INTO `dating` VALUES ('66', 'hjj', 'hjj@qq.com', 'jjj', '随便啦', '2018-03-31 17:07:01', '2018-03-31 17:07:01', '5', '2018-03-31 17:07:04', '2020-06-22 22:23:07');
INSERT INTO `dating` VALUES ('68', 'test', 'test@qq.com', 'jjj', '随便啦', '2020-03-23 22:03:34', '2020-03-23 22:03:34', '5', '2020-06-23 22:03:35', '2020-06-23 22:03:35');

-- ----------------------------
-- Table structure for joindating
-- ----------------------------
DROP TABLE IF EXISTS `joindating`;
CREATE TABLE `joindating` (
  `joinId` int(11) NOT NULL AUTO_INCREMENT,
  `joinDatingId` varchar(255) NOT NULL,
  `joinDatingSponsorName` varchar(255) NOT NULL,
  `joinDatingSponsorEmail` varchar(255) NOT NULL,
  `joinDatingName` varchar(255) NOT NULL,
  `joinDatingContent` varchar(255) NOT NULL DEFAULT '',
  `joinDatingStartTime` datetime NOT NULL,
  `joinDatingOverTime` datetime NOT NULL,
  `joinUserName` varchar(255) NOT NULL,
  `joinUserEmail` varchar(255) NOT NULL,
  `joinUserSex` varchar(255) NOT NULL,
  `joinUserIphone` varchar(255) NOT NULL,
  `joinDatingCreatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`joinId`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of joindating
-- ----------------------------
INSERT INTO `joindating` VALUES ('25', '58', 'huangjj', '346484458@qq.com', '清明节相约华软', '地点华软，人数越多越好', '2018-03-01 00:00:00', '2018-03-31 00:00:00', 'huangjj', '346484458@qq.com', '0', '18814128957', '2018-03-10 07:21:47');
INSERT INTO `joindating` VALUES ('26', '59', 'huangjj', '346484458@qq.com', '三八妇女节结伴爬山', '地点在从化大山，人数十人左右', '2018-03-08 00:00:00', '2018-03-08 00:00:00', 'huangjj', '346484458@qq.com', '0', '18814128957', '2018-03-10 07:25:09');
INSERT INTO `joindating` VALUES ('30', '61', 'huang0544', '346484458@qq.com', 'test', 'ab', '2018-03-10 10:30:44', '2018-03-10 10:30:44', 'huang0544', '346484458@qq.com', '男', '13112002200', '2018-03-10 10:31:06');
INSERT INTO `joindating` VALUES ('31', '59', 'huang0544', '346484458@qq.com', '三八妇女节结伴爬山', '地点在从化大山，人数十人左右', '2018-03-10 08:52:10', '2018-03-10 08:52:10', 'aaron', '542618305@qq.com', '女', '132326542', '2018-03-10 10:35:19');
INSERT INTO `joindating` VALUES ('32', '58', 'huang0544', '346484458@qq.com', '清明节相约华软', '地点华软，人数越多越好', '2018-03-10 08:52:10', '2018-03-10 08:52:10', 'aaron', '542618305@qq.com', '女', '132326542', '2018-03-10 10:57:26');
INSERT INTO `joindating` VALUES ('34', '5', '111', '346484458@qq.com', 'sadasd', '1111233', '2018-02-25 21:03:05', '2018-02-25 21:03:05', 'hjj', '346484458@qq.com', 'nan', '15917934393', '2018-03-10 11:47:00');
INSERT INTO `joindating` VALUES ('35', '67', 'hjj', '3464848@qq.com', 'test1', 'test1', '2018-04-09 23:53:59', '2018-04-09 23:53:59', 'hjj', '3464848@qq.com', '男', '19689405@qq.com', '2018-05-05 14:50:32');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` varchar(5) NOT NULL DEFAULT '男',
  `iphone` varchar(20) NOT NULL,
  `roleid` int(11) NOT NULL,
  `userCreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `userUpdateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('12345678@qq.com', '000000', 'huang', '女', '13112002200', '1', '0000-00-00 00:00:00', '2020-06-21 15:45:53');
INSERT INTO `users` VALUES ('123456910@qq.com', '123456', 'test', '男', '13517934393', '0', '2020-06-21 15:32:04', '2020-06-21 15:49:41');
INSERT INTO `users` VALUES ('346484458@qq.com', '123456', 'hjj', '男', '18814128957', '1', '0000-00-00 00:00:00', '2020-06-21 16:07:33');
INSERT INTO `users` VALUES ('34648448@qq.com', '000000', 'hjj', '女', '18814128957', '0', '0000-00-00 00:00:00', '2020-06-21 15:45:53');
INSERT INTO `users` VALUES ('3464848@qq.com', '000000', 'hjj', '男', '13112002200', '0', '0000-00-00 00:00:00', '2020-06-21 15:45:53');
INSERT INTO `users` VALUES ('542618305@qq.com', 'aaron28228', 'aaron', '女', '132326542', '0', '0000-00-00 00:00:00', '2020-06-21 15:45:53');
INSERT INTO `users` VALUES ('847977675@qq.com', '123456', '二哈土豆', '女', '18814117808', '0', '0000-00-00 00:00:00', '2020-06-21 15:45:53');