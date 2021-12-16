import React from "react";

import Top from "../Top";
import Container from "../Main";
import Footer from "../Footer";

import { Flex } from "./styles";

const Layout: React.FC = () => {
  return (
    <Flex>
      <Top />
      <Container />
      <Footer />
    </Flex>
  );
};

export default Layout;