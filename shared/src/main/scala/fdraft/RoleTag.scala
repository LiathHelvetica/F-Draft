package fdraft

enum RoleTag(val tag: String) {
  case Tank extends RoleTag("Tank")
  case Fighter extends RoleTag("Fighter")
  case Marksman extends RoleTag("Marksman")
  case Mage extends RoleTag("Mage")
  case Assassin extends RoleTag("Assassin")
  case Support extends RoleTag("Support")
}
