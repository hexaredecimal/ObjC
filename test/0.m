
int main(char *argv) // или же просто main()
{
  int i = 9;
  int j = 8 + i;
  int value = 1;
  value *= value++;
  value /= value - value--;
  value %= value % --value;
  value += value - --value;
  value >>= value + ++value;
  int integerVar = 100u; // DECIMAL_LITERAL=129
  return 0;
}
